"""실행 중인 NiFi에 대한 통합 테스트.

NIFI_URL       예) http://localhost:8080/nifi-api, https://localhost:8443/nifi-api
NIFI_USERNAME  설정하면 /access/token 으로 로그인 후 Bearer 토큰 사용 (HTTPS)
NIFI_PASSWORD
"""
import os
import time
import uuid

import pytest
import urllib3

import swagger_client
from swagger_client.rest import ApiException

URL = os.environ.get("NIFI_URL") or "http://localhost:8080/nifi-api"
USERNAME = os.environ.get("NIFI_USERNAME")
PASSWORD = os.environ.get("NIFI_PASSWORD")
SECURED = bool(USERNAME)
CLIENT_ID = "nifi-client-it-" + str(uuid.uuid4())

# docker 이미지의 self-signed 인증서는 검증하지 않는다
pytestmark = pytest.mark.filterwarnings("ignore::urllib3.exceptions.InsecureRequestWarning")


def new_client():
    cfg = swagger_client.Configuration()
    cfg.host = URL
    cfg.verify_ssl = not URL.startswith("https")
    return swagger_client.ApiClient(cfg)


@pytest.fixture(scope="module")
def client():
    c = new_client()
    if SECURED:
        token = swagger_client.AccessApi(c).create_access_token(username=USERNAME, password=PASSWORD)
        assert len(token.split(".")) == 3, "JWT 형식이 아님: %s" % token
        c.set_default_header("Authorization", "Bearer " + token)
    return c


def revision(version):
    return swagger_client.RevisionDTO(version=version, client_id=CLIENT_ID)


def position():
    return swagger_client.PositionDTO(x=0.0, y=0.0)


def wait_for(fn, predicate, message):
    for _ in range(30):
        value = fn()
        if predicate(value):
            return value
        time.sleep(0.5)
    raise AssertionError(message)


def test_about(client):
    about = swagger_client.FlowApi(client).get_about_info()
    assert about.about.version == "2.12.0"


def test_current_user(client):
    user = swagger_client.FlowApi(client).get_current_user()
    if SECURED:
        assert user.identity == USERNAME
        assert user.anonymous is False
    else:
        assert user.anonymous is True


@pytest.mark.skipif(not SECURED, reason="HTTPS 로그인 모드에서만 의미 있음")
def test_secured_endpoints_reject_missing_or_bad_credentials():
    with pytest.raises(ApiException) as no_token:
        swagger_client.FlowApi(new_client()).get_flow("root")
    assert no_token.value.status == 401

    with pytest.raises(ApiException) as bad_login:
        swagger_client.AccessApi(new_client()).create_access_token(username=USERNAME, password=PASSWORD + "-wrong")
    assert bad_login.value.status == 400


def test_process_group_and_processor_lifecycle(client):
    flow_api = swagger_client.FlowApi(client)
    groups_api = swagger_client.ProcessGroupsApi(client)
    processors_api = swagger_client.ProcessorsApi(client)

    root_id = flow_api.get_flow("root").process_group_flow.id
    assert root_id

    group = groups_api.create_process_group(swagger_client.ProcessGroupEntity(
        revision=revision(0),
        component=swagger_client.ProcessGroupDTO(name="nifi-client-it", position=position())), root_id)
    group_id = group.id
    try:
        processor = groups_api.create_processor(swagger_client.ProcessorEntity(
            revision=revision(0),
            component=swagger_client.ProcessorDTO(
                type="org.apache.nifi.processors.standard.GenerateFlowFile",
                name="generate",
                position=position(),
                config=swagger_client.ProcessorConfigDTO(
                    scheduling_period="10 sec",
                    auto_terminated_relationships=["success"]))), group_id)
        processor_id = processor.id
        assert processor.component.config.scheduling_period == "10 sec"

        processor = processors_api.update_processor(swagger_client.ProcessorEntity(
            revision=processor.revision,
            component=swagger_client.ProcessorDTO(
                id=processor_id, name="generate-renamed",
                config=swagger_client.ProcessorConfigDTO(scheduling_period="30 sec"))), processor_id)
        assert processor.component.name == "generate-renamed"
        assert processor.component.config.scheduling_period == "30 sec"

        processor = wait_for(lambda: processors_api.get_processor(processor_id),
                             lambda p: p.component.validation_status == "VALID",
                             "processor did not become VALID")

        processor = processors_api.update_run_status(swagger_client.ProcessorRunStatusEntity(
            revision=processor.revision, state="RUNNING"), processor_id)
        assert processor.component.state == "RUNNING"

        processor = processors_api.update_run_status(swagger_client.ProcessorRunStatusEntity(
            revision=processor.revision, state="STOPPED"), processor_id)
        assert processor.component.state == "STOPPED"

        processor = wait_for(lambda: processors_api.get_processor(processor_id),
                             lambda p: p.status.aggregate_snapshot.active_thread_count == 0,
                             "processor threads did not stop")
        processors_api.delete_processor(processor_id, version=processor.revision.version, client_id=CLIENT_ID)
    finally:
        current = groups_api.get_process_group(group_id)
        groups_api.remove_process_group(group_id, version=current.revision.version, client_id=CLIENT_ID)

    with pytest.raises(ApiException) as gone:
        groups_api.get_process_group(group_id)
    assert gone.value.status == 404
