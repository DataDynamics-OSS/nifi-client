# NiFi Client

[English](README.md) | **한국어**

Apache NiFi REST API 스펙으로 생성한 Java / Python 클라이언트. NiFi 1.x와 2.x를 함께 관리한다.

| | nifi-1.x | nifi-2.x |
|---|---|---|
| NiFi | 1.28.1 (1.x 마지막 릴리스) | 2.12.0 |
| 스펙 | Swagger 2.0 | OpenAPI 3.0.1 |
| Generator | swagger-codegen-cli 2.4.53 | swagger-codegen-cli 3.0.83 (v3) |
| 빌드 JDK / Java 타깃 | 11 / 11 | 21 / 21 |
| Java HTTP 라이브러리 | okhttp-gson | okhttp4-gson |
| Python | 3.9 | 3.9 |

버전 정보는 각 디렉터리의 `versions.env`에 있다.

## 디렉터리

```
nifi-1.x/ , nifi-2.x/
  versions.env                     NiFi / generator / Java / Python 버전
  swagger/<version>/swagger.json   nifi-web-api 빌드 산출물 (원본)
  config/java.json, python.json    생성 옵션
  java/                            생성된 Java 클라이언트 (Maven)
  python/                          생성된 Python 클라이언트 (setup.py)
  it/                              통합 테스트 (Java JUnit 5 / Python pytest, docker-compose)
scripts/generate.sh                java/, python/ 재생성
scripts/patch_spec.py              2.x 스펙 보정
```

`java/`, `python/`은 매번 지우고 다시 생성하므로 직접 수정하지 않는다.

## swagger.json 만들기

전체 빌드 없이 `nifi-web-api` 모듈만 컴파일하면 나머지 의존 모듈은 Maven Central에서 받아온다.

```bash
# 1.x: JDK 11 (1.x는 JDK 21 이상에서 빌드되지 않는다), Maven 3.6+
cd nifi-1.28.1
mvn -Dmaven.test.skip=true -Drat.skip=true -Dcheckstyle.skip=true \
    -pl nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api compile
# -> nifi-nar-bundles/.../nifi-web-api/target/swagger-ui/swagger.json

# 2.x: JDK 21, Maven 3.9.16+
cd nifi-2.12.0
mvn -Dmaven.test.skip=true -Drat.skip=true -Dcheckstyle.skip=true \
    -pl nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api compile
# -> nifi-framework-bundle/.../nifi-web-api/target/nifi-web-api-2.12.0/docs/rest-api/swagger.json
```

## 클라이언트 생성

```bash
scripts/generate.sh nifi-1.x
scripts/generate.sh nifi-2.x
```

생성 후 `pom.xml`/`build.gradle`의 Java 타깃과 `setup.py`의 `python_requires`를 `versions.env` 값으로 맞춘다.

### 2.x 보정 (`CODEGEN_FIXES=true`)

NiFi 2.x 스펙을 그대로 생성하면 동작하지 않는 부분이 있어서 `scripts/patch_spec.py`로 보정한 사본(`.codegen/nifi-2.x-swagger.json`)으로 생성한다.

- 쿼리/경로 파라미터가 `LongParameter`, `ClientIdParameter` 등 객체로 정의되어 있어 `version=class LongParameter {...}`처럼 전송된다 → 원시 타입으로 변경
- operationId에 `_1`, `_2` 접미사가 붙어 `getFlow1`, `updateRunStatus5` 같은 메서드가 생긴다 → 접미사 제거
- `/access/token` 폼 필드가 `password, username` 순서라 `createAccessToken(password, username)`이 된다 → `username, password`로 변경

생성된 Python 코드도 한 군데 고친다. swagger-codegen 3.x Python 템플릿은 응답 bytes를 디코딩하지 않아서 `text/plain` 응답(토큰)이 `"b'eyJ...'"`로 돌아온다.

## 빌드 / 설치

```bash
(cd nifi-1.x/java && mvn -DskipTests install)    # JDK 11
(cd nifi-2.x/java && mvn -DskipTests install)    # JDK 21
pip install ./nifi-1.x/python    # 또는 ./nifi-2.x/python, Python 3.9
```

Java는 `io.datadynamics:nifi-client-v1:1.28.1` / `io.datadynamics:nifi-client-v2:2.12.0`, Python은 `nifi-client-v1` / `nifi-client-v2`라서 두 버전을 함께 쓸 수 있다.
Java 패키지는 `io.datadynamics.nifi.client.v1` / `io.datadynamics.nifi.client.v2`, Python 패키지는 `nifi_client_v1` / `nifi_client_v2`이다.

빌드된 jar와 wheel은 GitHub 릴리스 `v1.28.1`, `v2.12.0`에 첨부되어 있다.

## 사용 예

### 1.x

API 메서드는 `(경로 파라미터, body)` 순서다. 스펙에 `securityDefinitions`가 없어서 `setAccessToken()`은 동작하지 않으므로 헤더를 직접 넣는다.

```java
ApiClient client = new ApiClient().setBasePath("https://localhost:8443/nifi-api");
client.setVerifyingSsl(false);   // self-signed 인증서인 경우
String token = new AccessApi(client).createAccessToken("admin", "password");
client.addDefaultHeader("Authorization", "Bearer " + token);
AboutEntity about = new FlowApi(client).getAboutInfo();
```

### 2.x

API 메서드는 `(body, 경로 파라미터)` 순서다. 스펙에 Bearer JWT가 정의되어 있어 `setAccessToken()`을 쓸 수 있다.
okhttp4-gson 클라이언트에는 `setVerifyingSsl()`이 없어서 self-signed 인증서는 `setHttpClient()`로 직접 설정한다 (`nifi-2.x/it/java`의 `trustAll()` 참고).

```java
ApiClient client = new ApiClient().setBasePath("https://localhost:8443/nifi-api");
String token = new AccessApi(client).createAccessToken("admin", "password");
client.setAccessToken(token);
ProcessorEntity p = new ProcessorsApi(client).updateRunStatus(runStatusEntity, processorId);
```

### Python

1.x는 `update_run_status(id, body)`, 2.x는 `update_run_status(body, id)` 순서다. 로그인은 두 버전 모두 같다.

```python
import nifi_client_v1 as nifi_client   # 2.x: nifi_client_v2
cfg = nifi_client.Configuration()
cfg.host = "https://localhost:8443/nifi-api"
cfg.verify_ssl = False           # self-signed 인증서인 경우
client = nifi_client.ApiClient(cfg)
token = nifi_client.AccessApi(client).create_access_token(username="admin", password="password")
client.set_default_header("Authorization", "Bearer " + token)
```

## 통합 테스트

`it/`에 실행 중인 NiFi를 대상으로 하는 테스트가 있다. about, 현재 사용자, Process Group/Processor 생성·수정·시작·정지·삭제, (HTTPS) 토큰 없음 401 / 잘못된 비밀번호 400을 확인한다.

| | HTTP (무인증) | HTTPS (single-user 로그인) |
|---|---|---|
| nifi-1.x | 38080 | 38443 |
| nifi-2.x | 39080 | 39443 |

2.x Docker 이미지는 HTTPS로만 시작하므로 `nifi-2.x/it/start-http.sh`로 HTTP 무인증 모드로 바꿔서 띄운다.

```bash
cd nifi-2.x/it
docker compose up -d

cd java
NIFI_URL=http://localhost:39080/nifi-api mvn test
NIFI_URL=https://localhost:39443/nifi-api NIFI_USERNAME=admin NIFI_PASSWORD=ctsBtRBKHRAx69EqUghvvgEvjnaLjFEB mvn test

cd ../python    # Python 3.9, pip install ../../python pytest
NIFI_URL=http://localhost:39080/nifi-api pytest
NIFI_URL=https://localhost:39443/nifi-api NIFI_USERNAME=admin NIFI_PASSWORD=ctsBtRBKHRAx69EqUghvvgEvjnaLjFEB pytest
```

1.x는 `nifi-1.x/it`에서 포트만 38080/38443으로 바꿔 같은 방법으로 실행한다.
