# NiFi Client Demo — 설계

NiFi 2.12.0을 docker compose로 띄우고, Spring Boot 웹 UI에서 생성된 Java 클라이언트(`io.datadynamics:nifi-client-v2`)를 직접 실행해 보는 데모.
목표는 **`git clone` → `docker compose up` → 브라우저** 세 단계로 클라이언트의 주요 사용법을 확인하는 것이다.

## 1. 목표와 범위

| 목표 | 내용 |
|---|---|
| 바로 실행 | 로컬에 JDK/Maven이 없어도 Docker만 있으면 된다. 생성된 클라이언트와 앱은 컨테이너 안에서 빌드한다. |
| 클라이언트 기능 노출 | 로그인·토큰, 프로세스 그룹, 프로세서, 연결·큐(FlowFile 목록·내용), 컨트롤러 서비스, 파라미터 컨텍스트, 프로비넌스, 플로우 정의 내보내기·업로드, 오류와 revision을 각각 화면으로 확인. |
| "무엇이 호출됐나"를 보여줌 | 화면의 모든 동작에 대해 **실행한 클라이언트 코드**, **실제 HTTP 요청(시도별)**, **결과 또는 `ApiException`**을 함께 보여준다. 데모의 핵심 가치. |
| 생성 코드 그대로 | 생성된 클라이언트(`nifi-2.x/java`)는 고치지 않는다. 생성 코드로 안 되는 부분은 앱 쪽에서 우회하고, 그 방법을 도움말과 §7에 적는다. 사용자가 실제로 겪을 일이기 때문이다. |
| 재실행 안전 | 시드 데이터는 "이름으로 찾고 없으면 만들기"로 넣어 몇 번을 다시 실행해도 같은 상태가 된다. |

범위 밖(1차): 1.x 클라이언트, Python 클라이언트, 클러스터(ZooKeeper), LDAP/OIDC 인증, NiFi Registry, 사이트 간 전송(S2S). 1.x는 API 인자 순서만 다르므로 도움말에서 차이를 설명한다.

## 2. 저장소 배치

```
nifi-client-demo/
  DESIGN.md                 # 이 문서
  README.md                 # 실행 방법 (3단계 + 문제 해결)
  .env                      # NiFi 버전, 포트, 데모용 비밀번호 (공개 가능한 기본값만)
  docker-compose.yml        # nifi + demo-app
  app/                      # Spring Boot 앱 (독립 Maven 프로젝트)
    Dockerfile              # 멀티 스테이지: 생성된 클라이언트 빌드 → 앱 빌드 → JRE 21 런타임
    Dockerfile.dockerignore # 빌드 컨텍스트(저장소 루트)에서 필요한 것만 보냄
    pom.xml
    src/main/java/io/datadynamics/nifi/demo/...
    src/main/resources/templates/...   # Thymeleaf
  scripts/
    smoke.sh                # 기동 후 주요 엔드포인트 점검 (CI/수동)
```

- 앱은 `nifi-2.x/java`(생성 코드, 매번 지우고 다시 만듦)에 넣지 않는다. 데모는 **배포된 클라이언트를 쓰는 일반 사용자 관점**을 유지한다. 앱 `pom.xml`은 `nifi-client-v2:${nifi-client.version}`(기본 `2.12.0`)에 의존한다.
- `scripts/publish-public.sh`로 공개 저장소에 그대로 나가므로 `nifi-client-demo/` 안에는 데모용 비밀번호 외의 비밀값을 두지 않는다.

## 3. Docker 구성

### 3.1 이미지 출처

| 서비스 | 이미지 | 비고 |
|---|---|---|
| `nifi` | `apache/nifi:2.12.0` | Docker Hub 공식. HTTPS 8443, single-user 로그인. 시작할 때 자체 서명 인증서를 만든다 |
| `demo-app` | **로컬 빌드** `nifi-client-demo/app/Dockerfile` | 포트 8080 |

모든 이미지가 amd64/arm64를 지원하므로 Apple Silicon에서도 동작한다.

### 3.2 서비스 구성과 기동 순서

```
nifi ──healthy──► demo-app
```

| 서비스 | healthcheck | 포트(호스트) |
|---|---|---|
| nifi | `curl -skf https://nifi:8443/nifi-api/authentication/configuration` (로그인 없이 답하는 공개 엔드포인트. NiFi는 호스트 이름에만 바인딩하므로 `localhost`로는 연결되지 않음) | `${NIFI_PORT:-8443}` |
| demo-app | `curl -sf /actuator/health/liveness` | `${APP_PORT:-8080}` |

- 앱은 NiFi가 healthy가 된 뒤 뜬다. 그래도 NiFi가 흐름을 아직 불러오는 중일 수 있으므로 시더는 `/flow/about`이 답할 때까지 기다린다(§5).
- 볼륨 없음: `docker compose down`이 곧 초기화이고, `stop`/`start`는 상태를 유지한다.
- 필요 자원: 메모리 약 3 GB, 이미지 약 2 GB(NiFi 이미지가 대부분).

### 3.3 서버 설정 포인트

- `SINGLE_USER_CREDENTIALS_USERNAME/PASSWORD`: single-user 로그인 계정. 비밀번호는 12자 이상이어야 NiFi가 받는다.
- `hostname: nifi`: 앱은 `https://nifi:8443`으로 부른다. NiFi는 자기 호스트 이름으로 들어온 Host 헤더를 허용하므로 따로 설정할 필요가 없다.
- `NIFI_WEB_PROXY_HOST=localhost:${NIFI_PORT}`: 브라우저가 게시된 포트로 NiFi UI를 열 수 있게 한다.
- single-user 모드에서는 사용자·그룹·정책 API(`TenantsApi`, `PoliciesApi`)가 409를 돌려준다. 데모는 이것을 오류 카탈로그의 한 예로 쓴다.

## 4. 데모 앱 아키텍처

### 4.1 기술 선택

| 항목 | 선택 | 이유 |
|---|---|---|
| 런타임 | Java 21, Spring Boot 4.1.x | 생성된 2.x 클라이언트가 Java 21 타깃 |
| UI | **Thymeleaf + htmx**(CDN 없이 webjar), 자체 CSS·JS(`static/css/demo.css`, `static/js/demo.js`) | Node 빌드 없이 Maven 하나로 끝남. 화면 구성(상단 메뉴, 오른쪽 도움말 패널, 요청 표)은 다른 Client 데모와 같다 |
| JSON·Java 보기/편집 | Monaco Editor webjar(`pre.code[data-lang]`, `textarea[data-editor]`) | 오프라인에서도 동작. Monaco를 불러오지 못하면 원래 `<pre>`/`<textarea>`를 그대로 씀 |
| 클라이언트 연결 | 생성된 `ApiClient` 하나를 빈으로 만들고 `XxxApi`들이 공유 | starter가 없으므로 구성 코드(`NifiClientConfig`) 자체가 사용 예제 |
| HTTP 기록·인증 | OkHttp 인터셉터 2개, OkHttp `Authenticator` | 생성된 클라이언트는 훅이 없지만 `setHttpClient`로 OkHttp를 바꿔 끼울 수 있다 |
| 관측 | Actuator(`nifi` 헬스 인디케이터), Micrometer(Prometheus 엔드포인트) | |

### 4.2 패키지 구조

```
io.datadynamics.nifi.demo
  DemoApplication
  config/        # NifiProperties, NifiClientConfig(ApiClient·XxxApi 빈), NifiSession(로그인·Authenticator),
                 # NifiDateTimeAdapter(§7), NifiHealthIndicator, WebConfig
  trace/         # SdkCalls, SdkCall, HttpAttempt, TraceInterceptor (§4.3)
  seed/          # DemoSeeder (ApplicationReadyEvent에서 비동기 실행, 대기 포함)
  web/
    dashboard/ groups/ processors/ queues/ services/ parameters/
    provenance/ flows/ lab/ calls/
  web/support/   # 예외 → 화면 변환(Failure, ErrorAdvice), 폼 → 모델 변환(Inputs), JSON(Json), Revisions
```

컨트롤러는 화면 요청을 받아 **생성된 API 메서드를 직접 호출**한다. 별도 서비스 계층으로 감싸지 않는다 — 데모를 읽는 사람이 "이 버튼 = 이 API 호출"을 한눈에 보게 하기 위해서다. 공통 로직(기록, 예외 처리)만 `trace/`와 `web/support/`에 둔다.

### 4.3 화면 구성과 호출 기록 (모든 화면 공통)

모든 화면은 `templates/fragments.html`의 조각으로 같은 틀을 쓴다: `head(title)`, `nav(active)`(상단 메뉴와 "? 도움말"),
본문(`main`), 오른쪽 도움말(`templates/help/<화면>.html`의 `help` 조각), 본문 맨 아래 요청 표(`trace`).

```
┌ 결과 패널 (fragments/call :: panel) ─────────────────────┐
│ [성공] 23 ms · HTTP 요청 3건                              │
│ processors.updateProcessor(entity, id)  ← 실행한 코드     │
│ ▸ 결과: ProcessorEntity (JSON)  |  또는 예외 상자         │
└───────────────────────────────────────────────────────────┘
┌ 이 화면에서 클라이언트가 보낸 요청 (fragments :: trace) ─┐
│ # 클라이언트 메서드 경로(펼치면 URI·본문) 시도 상태 시간  │
└───────────────────────────────────────────────────────────┘
```

- **HTTP 시도**: `SdkCalls.install(OkHttpClient.Builder, name)`이 인터셉터 두 개를 붙인다.
  - 네트워크 인터셉터: 서버에 실제로 나간 요청마다 불린다. 401 → (Authenticator가 로그인) → 재전송처럼 OkHttp가 안에서 다시 보낸 요청도 따로 기록된다.
  - 애플리케이션 인터셉터: API 메서드 호출마다 한 번. 시도 번호를 ThreadLocal로 세고, 연결 자체가 안 되어 네트워크 인터셉터까지 가지 못한 실패(호스트를 찾을 수 없음 등)를 기록한다. 응답 본문을 그대로 보려고 `Accept-Encoding: identity`를 붙인다.
  - 기록은 세 곳에 쌓인다: 실행 중인 호출(`SdkCall.attempts`), 현재 웹 요청(`TraceInterceptor`가 시작·정리하는 ThreadLocal 목록), 앱 전체 이력(최근 300건). 본문은 20,000자까지 보관한다. 요청의 비밀번호(폼·JSON)는 가리고, `/access/token` 응답(JWT)은 앞 16자만 남긴다. 파일 내용처럼 글자가 아닌 응답은 타입과 크기만 적는다.
- **코드 문자열**: 컨트롤러가 `calls.run("processors.getProcessor(\"" + id + "\")", () -> processors.getProcessor(id))` 형태로 실행한다. 문자열은 손으로 쓴다(리플렉션·AOP로 생성하지 않음 — 읽는 코드가 실제 예제와 같아야 함).
- **비동기 요청**: NiFi의 큐 listing·drop, 프로비넌스 query, 파라미터 컨텍스트 update는 "요청 만들기 → 완료될 때까지 조회 → 삭제" 3단계다. 각 단계를 별도 호출로 기록해 결과 패널에 단계 목록(`fragments :: steps`)으로 보여준다.
- **htmx 동작**: 폼 동작은 결과 조각(`fragments/call :: call`)만 돌려준다. 이 조각에는 그 동작에서 보낸 요청 표가 함께 붙는다. 끼워 넣은 뒤 `demo.js`가 코드 블록을 Monaco로 바꾼다.
- **오류**: `SdkCalls.run` 안의 예외는 결과 패널의 예외 상자(`fragments :: failure`)로, 그 밖의 `ApiException`·잘못된 입력은 `ErrorAdvice`가 `failure.html`로 보여준다. `ApiException`은 하나뿐이므로 상자는 HTTP 상태(응답 없음이면 `getCode() = 0`), NiFi 메시지(응답 본문), 원인 예외로 구분한다.
- **요청 기록 화면**: 앱 전체 이력(헬스 체크·시더 포함), 클라이언트별 필터, 최근 호출, Micrometer 요약.

### 4.4 인증 (`NifiSession`)

- 앱은 시작할 때 로그인하지 않는다. 첫 요청이 401을 받으면 OkHttp `Authenticator`가 `AccessApi.createAccessToken`으로 로그인해 `ApiClient.setAccessToken`을 바꾸고 그 요청을 한 번 다시 보낸다. 요청 기록에 시도 1(401) → 로그인(201) → 시도 2(200)로 보인다.
- `/access/token` 자체의 401·400, 이미 한 번 재전송한 요청(`priorResponse`가 있음)은 다시 시도하지 않는다. 다른 스레드가 이미 토큰을 바꿨으면 로그인하지 않고 새 토큰으로 보낸다.
- 토큰 만료 시각은 JWT의 `exp`를 읽어 대시보드에 보여준다(NiFi 기본 12시간). 장애 실험의 "토큰 만료"는 토큰을 가짜 값으로 바꿔 이 흐름을 재현한다.

### 4.5 설정 (`application.yml`)

```yaml
nifi:
  url: ${NIFI_URL:https://nifi:8443/nifi-api}
  username: ${NIFI_USERNAME:admin}
  password: ${NIFI_PASSWORD}
  insecure-tls: true          # 자체 서명 인증서. OkHttp에 trust-all을 설정
  connect-timeout: 10s
  read-timeout: 60s
demo:
  seed: {enabled: true, timeout: 5m}
```

호스트에서 `mvn spring-boot:run`으로 앱만 띄울 때는 `https://localhost:8443/nifi-api`를 쓰는 `local` 프로파일을 쓴다.

## 5. 시드 데이터

`DemoSeeder`가 기동 후 별도 스레드에서 NiFi 준비(`/flow/about`)를 기다린 뒤(최대 5분) 아래를 넣는다. 모두 이름으로 찾고 없을 때만 만들므로 재실행해도 같다. 실패하면 앱은 계속 뜨고 대시보드에 시드 상태와 실패한 단계·예외를 보여준다. 대시보드에 "시드 다시 실행" 버튼.

| 대상 | 내용 | 사용하는 API |
|---|---|---|
| 파라미터 컨텍스트 | `demo-params`: `env=demo`, `greeting=hello from nifi-client-demo` | `ParameterContextsApi.createParameterContext` |
| 프로세스 그룹 | root 아래 `demo-flow`, `demo-params` 연결 | `ProcessGroupsApi.createProcessGroup` |
| 컨트롤러 서비스 | `demo-json-reader`(JsonTreeReader), `demo-json-writer`(JsonRecordSetWriter), VALID가 되면 활성 | `ProcessGroupsApi.createControllerService`, `ControllerServicesApi.updateRunStatus` |
| 프로세서 | `generate`(GenerateFlowFile, 5초마다 `#{greeting}`을 담은 JSON), `tag`(UpdateAttribute, `env=#{env}`), `log`(LogAttribute, success 자동 종료) | `ProcessGroupsApi.createProcessor` |
| 연결 | `generate → tag`, `tag → log` (success) | `ProcessGroupsApi.createConnection` |
| 실행 | `generate`, `tag` 시작. `log`는 멈춰 두어 `tag → log` 큐에 FlowFile이 쌓이게 함(큐·프로비넌스 화면용) | `FlowApi.scheduleComponents` |

## 6. 화면 구성 (클라이언트 기능 매핑)

| 화면 | 기능 | API |
|---|---|---|
| **대시보드** | 연결 정보(주소·인증서 검증·토큰 미리보기·만료·로그인 횟수), NiFi 버전, 현재 사용자, 컨트롤러 상태(실행·정지·무효 개수, 큐), 시스템 진단(힙·스레드·저장소), 최근 bulletin, 시드 상태, 수동 로그인 | `FlowApi.getAboutInfo/getCurrentUser/getControllerStatus/getBulletinBoard`, `SystemDiagnosticsApi`, `AccessApi` |
| **프로세스 그룹** | 흐름 그림(같은 `getFlow` 응답의 `getPosition()`·연결·`getBends()`로 서버에서 SVG를 그림, `FlowGraph`), 그룹 트리(breadcrumb), 하위 그룹·프로세서·연결 표, 하위 그룹 생성, 모두 시작·정지, 모든 큐 비우기(비동기), JSON 편집 저장(revision), 삭제 | `FlowApi.getFlow/scheduleComponents`, `ProcessGroupsApi.*` |
| **프로세서** | 전체 목록(하위 그룹 포함), 타입 검색 후 생성, 상세(속성·관계·상태), 속성·스케줄 JSON 편집, RUNNING/STOPPED/RUN_ONCE, 삭제 | `ProcessGroupsApi.getProcessors`, `FlowApi.getProcessorTypes`, `ProcessorsApi.*` |
| **연결·큐** | 전체 연결과 큐 크기(그룹 상태 재귀), 연결 생성, FlowFile listing(비동기), FlowFile 속성, 내용 다운로드, 큐 비우기(비동기 drop), 설정 편집, 삭제 | `FlowApi.getProcessGroupStatus`, `ConnectionsApi`, `FlowFileQueuesApi` |
| **컨트롤러 서비스** | 목록, 타입 검색 후 생성, 상세, 활성·비활성, 참조 컴포넌트, 편집, 삭제 | `FlowApi.getControllerServicesFromGroup`, `ControllerServicesApi` |
| **파라미터** | 컨텍스트 목록, 생성(민감 파라미터 포함, 화면의 코드에서도 값을 가림), 값 변경(비동기 update request), 그룹 연결, 삭제 | `ParameterContextsApi` |
| **프로비넌스** | 검색 옵션, 컴포넌트 id로 이벤트 검색(비동기 query), 이벤트 상세(속성 변경 표시), 입력·출력 내용 | `ProvenanceApi`, `ProvenanceEventsApi` |
| **플로우 정의** | 그룹을 flow definition JSON으로 내보내기, 편집 후 새 그룹으로 업로드 | `ProcessGroupsApi.exportProcessGroup/uploadProcessGroup` |
| **장애 실험** | ① 토큰 만료: 토큰을 가짜로 바꾸고 호출 → 401 → 재로그인 → 재전송 ② 1 ms read timeout(`SocketTimeoutException`, `getCode() = 0`) ③ 오류 카탈로그: 404(없는 id), 400(revision 1로 생성), 409(없는 타입), 409(실행 중인 프로세서 수정), 409(single-user 모드의 tenants), 400(틀린 비밀번호), 401(토큰 없는 클라이언트), 연결 실패(없는 호스트) ④ revision 충돌: 같은 프로세서를 두 번 읽어 차례로 수정 → 다른 clientId의 옛 revision은 400, 같은 clientId면 통과 | 별도 `ApiClient`(`LabClients`), `ApiException` |
| **요청 기록** | 최근 HTTP 시도와 본문, 최근 호출, `/actuator/metrics/nifi.client.requests`·`nifi.client.retries` 요약 | OkHttp 인터셉터, Micrometer |

공통 UX: 상단 메뉴, 오른쪽 도움말, §4.3 결과 패널. 삭제는 확인 대화상자. 시드 리소스를 지우면 "시드 다시 실행"으로 복구.

## 7. 생성된 클라이언트에서 확인한 제약과 우회

데모는 생성 코드를 고치지 않고 아래처럼 우회한다. 각 화면의 도움말에도 같은 내용을 적었다.

| 제약 | 증상 | 데모의 우회 |
|---|---|---|
| NiFi 날짜 형식 | NiFi는 `"10/31/2026 06:49:58.970 UTC"`(`MM/dd/yyyy HH:mm:ss.SSS z`)로 날짜를 보내는데 생성된 Gson 어댑터는 ISO만 읽어 `DateTimeParseException` (큐 listing, 프로비넌스, bulletin 등) | `NifiDateTimeAdapter`(ISO → NiFi 형식 → epoch ms 순으로 시도)를 `client.getJSON().setGson(gson.newBuilder().registerTypeAdapter(OffsetDateTime.class, …))`로 등록 |
| `ParameterContextDTO`에 `id` setter 없음 | 스펙에서 `id`가 readOnly라 setter가 생성되지 않음. 그런데 update 요청은 `component.id`가 없으면 400 "Parameter Context's ID must be specified" | 서버에서 읽은 DTO(`current.getComponent()`)에 `parameters(...)`만 바꿔 다시 보냄 |
| 내용 다운로드 API의 반환 타입 | FlowFile·프로비넌스 내용 API가 `StreamingOutput`을 반환하도록 생성되어 본문을 받을 수 없음 | `...Call(...)` 메서드로 OkHttp `Call`을 만들어 직접 `execute()` |
| 업로드 API의 파일 인자 | `uploadProcessGroup(..., Object file, ...)`이 `java.io.File`만 multipart로 보냄 | JSON을 임시 파일에 써서 넘기고 끝나면 지움 |
| TLS 설정 | okhttp4-gson 생성 코드에는 `setVerifyingSsl()`이 없음 | `OkHttpClient.Builder`에 trust-all `SSLSocketFactory`·`HostnameVerifier`를 설정해 `setHttpClient`로 교체 |
| 예외 타입 | 모든 실패가 `ApiException` 하나. 응답이 없으면 `getCode() == 0`이고 원인은 `getCause()` | `Failure.of(e)`가 상태·본문·원인으로 나눠 표시 |
| 인자 순서 | 2.x 메서드는 (본문, 경로 파라미터) 순서 | 도움말 코드 예제에 그대로 표시 |

## 8. 빌드

`nifi-client-demo/app/Dockerfile` (빌드 컨텍스트는 저장소 루트, `Dockerfile.dockerignore`로 `nifi-2.x/java/`와 앱 소스만 보냄):

```dockerfile
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /src
COPY nifi-2.x/java/ nifi-2.x/java/
RUN --mount=type=cache,target=/root/.m2 \
    mvn -B -ntp -f nifi-2.x/java/pom.xml install -DskipTests -Dmaven.javadoc.skip=true -Dmaven.source.skip=true
COPY nifi-client-demo/app/pom.xml nifi-client-demo/app/pom.xml
COPY nifi-client-demo/app/src/ nifi-client-demo/app/src/
RUN --mount=type=cache,target=/root/.m2 mvn -B -ntp -f nifi-client-demo/app/pom.xml package -DskipTests

FROM eclipse-temurin:21-jre
# curl(헬스체크), 비 root 사용자
COPY --from=build /src/nifi-client-demo/app/target/nifi-client-demo.jar /app/app.jar
ENTRYPOINT ["java", "-XX:MaxRAMPercentage=75", "-jar", "/app/app.jar"]
```

- 현재 작업 트리의 생성 클라이언트를 그대로 빌드하므로 `scripts/generate.sh nifi-2.x`로 다시 생성하고 `docker compose up --build demo-app`이면 데모에 반영된다.

## 9. 테스트

| 종류 | 내용 |
|---|---|
| 앱 단위 | `NifiDateTimeAdapterTest`(NiFi 형식·ISO·`+0000`·epoch ms·null·잘못된 값), `SdkCallsTest`(폼·JSON 비밀번호 가리기) |
| 스모크 | `nifi-client-demo/scripts/smoke.sh`: `docker compose up --wait` 후 `/actuator/health`, 모든 화면 GET 200, 시드 `DONE`, NiFi REST로 로그인해 `demo-flow` 존재 확인 |
| 통합 | 클라이언트 자체의 통합 테스트는 `nifi-2.x/it`에 있다 |

## 10. 확장 여지

- 1.x 클라이언트 화면 전환(인자 순서와 응답 차이 비교).
- NiFi Registry 컨테이너를 붙여 버전 관리(`VersionsApi`) 화면.
- 2노드 클러스터로 노드 상태·연결 끊김 확인.
- Python 클라이언트(`nifi_client_v2`)로 같은 동작을 하는 노트북.

## 11. 결정 사항

| 항목 | 선택 | 대안 |
|---|---|---|
| UI 기술 | Thymeleaf + htmx (Node 불필요) | React/Vite SPA — 화면이 풍부해지지만 빌드 체인 추가 |
| 대상 버전 | NiFi 2.12.0 + `nifi-client-v2` | 1.x — 공식 이미지가 HTTP로도 뜨지만 유지보수 종료 |
| 인증 | HTTPS + single-user 로그인, `Authenticator`로 자동 재로그인 | 비인증 HTTP(`nifi-2.x/it/start-http.sh` 방식) — 단순하지만 토큰 흐름을 보여줄 수 없음 |
| 생성 코드의 제약 | 앱에서 우회하고 문서화(§7) | 생성 템플릿·스펙 보정(`patch_spec.py`)으로 고치기 — 별도 작업으로 남김 |
| 앱 위치 | `nifi-client-demo/app` 독립 Maven 프로젝트 | `nifi-2.x/java`에 모듈 추가 (생성 시 지워짐) |
