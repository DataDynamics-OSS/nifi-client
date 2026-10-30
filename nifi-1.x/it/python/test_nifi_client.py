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

import nifi_client_v1
from nifi_client_v1.rest import ApiException

URL = os.environ.get("NIFI_URL") or "http://localhost:8080/nifi-api"
USERNAME = os.environ.get("NIFI_USERNAME")
PASSWORD = os.environ.get("NIFI_PASSWORD")
SECURED = bool(USERNAME)
CLIENT_ID = "nifi-client-it-" + str(uuid.uuid4())

# docker 이미지의 self-signed 인증서는 검증하지 않는다
pytestmark = pytest.mark.filterwarnings("ignore::urllib3.exceptions.InsecureRequestWarning")


def new_client():
    cfg = nifi_client_v1.Configuration()
    cfg.host = URL
    cfg.verify_ssl = not URL.startswith("https")
    return nifi_client_v1.ApiClient(cfg)


@pytest.fixture(scope="module")
def client():
    c = new_client()
    if SECURED:
        token = nifi_client_v1.AccessApi(c).create_access_token(username=USERNAME, password=PASSWORD)
        assert len(token.split(".")) == 3, "JWT 형식이 아님: %s" % token
        c.set_default_header("Authorization", "Bearer " + token)
    return c


def revision(version):
    return nifi_client_v1.RevisionDTO(version=version, client_id=CLIENT_ID)


def position():
    return nifi_client_v1.PositionDTO(x=0.0, y=0.0)


def wait_for(fn, predicate, message):
    for _ in range(30):
        value = fn()
        if predicate(value):
            return value
        time.sleep(0.5)
    raise AssertionError(message)


def test_about(client):
    about = nifi_client_v1.FlowApi(client).get_about_info()
    assert about.about.version == "1.28.1"


def test_current_user(client):
    user = nifi_client_v1.FlowApi(client).get_current_user()
    if SECURED:
        assert user.identity == USERNAME
        assert user.anonymous is False
    else:
        assert user.anonymous is True


@pytest.mark.skipif(not SECURED, reason="HTTPS 로그인 모드에서만 의미 있음")
def test_secured_endpoints_reject_missing_or_bad_credentials():
    with pytest.raises(ApiException) as no_token:
        nifi_client_v1.FlowApi(new_client()).get_flow("root")
    assert no_token.value.status == 401

    with pytest.raises(ApiException) as bad_login:
        nifi_client_v1.AccessApi(new_client()).create_access_token(username=USERNAME, password=PASSWORD + "-wrong")
    assert bad_login.value.status == 400


def test_process_group_and_processor_lifecycle(client):
    flow_api = nifi_client_v1.FlowApi(client)
    groups_api = nifi_client_v1.ProcessGroupsApi(client)
    processors_api = nifi_client_v1.ProcessorsApi(client)

    root_id = flow_api.get_flow("root").process_group_flow.id
    assert root_id

    group = groups_api.create_process_group(root_id, nifi_client_v1.ProcessGroupEntity(
        revision=revision(0),
        component=nifi_client_v1.ProcessGroupDTO(name="nifi-client-it", position=position())))
    group_id = group.id
    try:
        processor = groups_api.create_processor(group_id, nifi_client_v1.ProcessorEntity(
            revision=revision(0),
            component=nifi_client_v1.ProcessorDTO(
                type="org.apache.nifi.processors.standard.GenerateFlowFile",
                name="generate",
                position=position(),
                config=nifi_client_v1.ProcessorConfigDTO(
                    scheduling_period="10 sec",
                    auto_terminated_relationships=["success"]))))
        processor_id = processor.id
        assert processor.component.config.scheduling_period == "10 sec"

        processor = processors_api.update_processor(processor_id, nifi_client_v1.ProcessorEntity(
            revision=processor.revision,
            component=nifi_client_v1.ProcessorDTO(
                id=processor_id, name="generate-renamed",
                config=nifi_client_v1.ProcessorConfigDTO(scheduling_period="30 sec"))))
        assert processor.component.name == "generate-renamed"
        assert processor.component.config.scheduling_period == "30 sec"

        processor = wait_for(lambda: processors_api.get_processor(processor_id),
                             lambda p: p.component.validation_status == "VALID",
                             "processor did not become VALID")

        processor = processors_api.update_run_status(processor_id, nifi_client_v1.ProcessorRunStatusEntity(
            revision=processor.revision, state="RUNNING"))
        assert processor.component.state == "RUNNING"

        processor = processors_api.update_run_status(processor_id, nifi_client_v1.ProcessorRunStatusEntity(
            revision=processor.revision, state="STOPPED"))
        assert processor.component.state == "STOPPED"

        processor = wait_for(lambda: processors_api.get_processor(processor_id),
                             lambda p: p.status.aggregate_snapshot.active_thread_count == 0,
                             "processor threads did not stop")
        processors_api.delete_processor(processor_id, version=str(processor.revision.version), client_id=CLIENT_ID)
    finally:
        current = groups_api.get_process_group(group_id)
        groups_api.remove_process_group(group_id, version=str(current.revision.version), client_id=CLIENT_ID)

    with pytest.raises(ApiException) as gone:
        groups_api.get_process_group(group_id)
    assert gone.value.status == 404
