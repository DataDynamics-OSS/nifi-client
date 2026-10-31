# NiFi Client

**English** | [한국어](README.ko.md)

Java / Python clients generated from the Apache NiFi REST API spec. NiFi 1.x and 2.x are maintained side by side.

| | nifi-1.x | nifi-2.x |
|---|---|---|
| NiFi | 1.28.1 (last 1.x release) | 2.12.0 |
| Spec | Swagger 2.0 | OpenAPI 3.0.1 |
| Generator | swagger-codegen-cli 2.4.53 | swagger-codegen-cli 3.0.83 (v3) |
| Build JDK / Java target | 11 / 11 | 21 / 21 |
| Java HTTP library | okhttp-gson | okhttp4-gson |
| Python | 3.9 | 3.9 |

Version settings live in each directory's `versions.env`.

## Layout

```
nifi-1.x/ , nifi-2.x/
  versions.env                     NiFi / generator / Java / Python versions
  swagger/<version>/swagger.json   nifi-web-api build output (original)
  config/java.json, python.json    generator options
  java/                            generated Java client (Maven)
  python/                          generated Python client (setup.py)
  it/                              integration tests (Java JUnit 5 / Python pytest, docker-compose)
nifi-client-demo/                  web demo of the 2.x Java client (docker compose)
scripts/generate.sh                regenerates java/ and python/
scripts/patch_spec.py              fixes up the 2.x spec
```

`java/` and `python/` are deleted and regenerated every time. Do not edit them by hand.

## Building swagger.json

Compiling only the `nifi-web-api` module is enough; the other NiFi modules it depends on are pulled from Maven Central.

```bash
# 1.x: JDK 11 (1.x does not build on JDK 21+), Maven 3.6+
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

## Generating the clients

```bash
scripts/generate.sh nifi-1.x
scripts/generate.sh nifi-2.x
```

After generation, the Java target in `pom.xml`/`build.gradle` and `python_requires` in `setup.py` are set from `versions.env`.

### 2.x fixes (`CODEGEN_FIXES=true`)

Some parts of the NiFi 2.x spec do not work when generated as-is, so the client is generated from a copy fixed by `scripts/patch_spec.py` (`.codegen/nifi-2.x-swagger.json`).

- Query/path parameters are defined as objects such as `LongParameter` and `ClientIdParameter`, so they are sent as `version=class LongParameter {...}` → changed to primitive types
- operationIds carry `_1`, `_2` suffixes, producing methods like `getFlow1` and `updateRunStatus5` → suffixes removed
- The `/access/token` form fields are ordered `password, username`, producing `createAccessToken(password, username)` → reordered to `username, password`

One fix is also applied to the generated Python code. The swagger-codegen 3.x Python template does not decode response bytes, so `text/plain` responses (the token) come back as `"b'eyJ...'"`.

## Build / install

```bash
(cd nifi-1.x/java && mvn -DskipTests install)    # JDK 11
(cd nifi-2.x/java && mvn -DskipTests install)    # JDK 21
pip install ./nifi-1.x/python    # or ./nifi-2.x/python, Python 3.9
```

Java is published as `io.datadynamics:nifi-client-v1:1.28.1` / `io.datadynamics:nifi-client-v2:2.12.0`, and Python as `nifi-client-v1` / `nifi-client-v2`, so both lines can be used together.
The Java package is `io.datadynamics.nifi.client.v1` / `io.datadynamics.nifi.client.v2` and the Python package is `nifi_client_v1` / `nifi_client_v2`.

Prebuilt jars and wheels are attached to the GitHub releases `v1.28.1` and `v2.12.0`.

## Usage

### 1.x

API methods take `(path parameter, body)`. The spec has no `securityDefinitions`, so `setAccessToken()` does not work; set the header yourself.

```java
ApiClient client = new ApiClient().setBasePath("https://localhost:8443/nifi-api");
client.setVerifyingSsl(false);   // for self-signed certificates
String token = new AccessApi(client).createAccessToken("admin", "password");
client.addDefaultHeader("Authorization", "Bearer " + token);
AboutEntity about = new FlowApi(client).getAboutInfo();
```

### 2.x

API methods take `(body, path parameter)`. The spec defines Bearer JWT, so `setAccessToken()` works.
The okhttp4-gson client has no `setVerifyingSsl()`; for self-signed certificates, configure it with `setHttpClient()` (see `trustAll()` in `nifi-2.x/it/java`).

```java
ApiClient client = new ApiClient().setBasePath("https://localhost:8443/nifi-api");
String token = new AccessApi(client).createAccessToken("admin", "password");
client.setAccessToken(token);
ProcessorEntity p = new ProcessorsApi(client).updateRunStatus(runStatusEntity, processorId);
```

### Python

1.x takes `update_run_status(id, body)`, 2.x takes `update_run_status(body, id)`. Login is the same for both.

```python
import nifi_client_v1 as nifi_client   # 2.x: nifi_client_v2
cfg = nifi_client.Configuration()
cfg.host = "https://localhost:8443/nifi-api"
cfg.verify_ssl = False           # for self-signed certificates
client = nifi_client.ApiClient(cfg)
token = nifi_client.AccessApi(client).create_access_token(username="admin", password="password")
client.set_default_header("Authorization", "Bearer " + token)
```

## Integration tests

`it/` holds tests that run against a live NiFi. They check about, current user, Process Group/Processor create, update, start, stop and delete, and (HTTPS) 401 without a token / 400 on a wrong password.

| | HTTP (no auth) | HTTPS (single-user login) |
|---|---|---|
| nifi-1.x | 38080 | 38443 |
| nifi-2.x | 39080 | 39443 |

The 2.x Docker image only starts with HTTPS, so `nifi-2.x/it/start-http.sh` switches it to unauthenticated HTTP mode.

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

For 1.x, run the same steps from `nifi-1.x/it` with ports 38080/38443.

## Demo

[nifi-client-demo](nifi-client-demo/README.md) starts NiFi 2.12.0 with docker compose and runs a Spring Boot web UI (Korean) that calls the generated 2.x Java client from every screen, showing the client code, each HTTP request with its bodies, and the result or `ApiException`.

```bash
cd nifi-client-demo && docker compose up -d --build --wait && open http://localhost:8080
```
