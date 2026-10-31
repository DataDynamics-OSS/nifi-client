# NiFi Client 데모

NiFi 2.12.0을 docker compose로 띄우고, Spring Boot 웹 UI에서 생성된 Java 클라이언트(`io.datadynamics:nifi-client-v2`)의 기능을 하나씩 실행해 보는 데모.
화면의 모든 동작은 **실행한 클라이언트 코드**, **실제 HTTP 요청(시도별, 401 → 로그인 → 재전송 포함, 요청·응답 본문)**, **결과 또는 `ApiException`**을 함께 보여준다.
설계는 [DESIGN.md](DESIGN.md) 참고.

## 준비물

- Docker (Compose v2), 메모리 약 3 GB, 디스크 약 2.5 GB
- JDK/Maven은 필요 없다. 생성된 클라이언트와 앱은 이미지 빌드 중에 컨테이너 안에서 빌드한다.

## 빠른 시작

```bash
cd nifi-client-demo
docker compose up -d --build --wait     # 처음에는 이미지 다운로드·빌드 포함 3–6분
open http://localhost:8080              # 브라우저로 접속
docker compose down                     # 정지. 모든 데이터가 함께 지워진다
```

- 앱이 뜨면 시드 데이터(파라미터 컨텍스트, `demo-flow` 그룹, 컨트롤러 서비스 2개, 프로세서 3개와 연결 2개)를 클라이언트로 넣는다. 대시보드의 **시드 데이터** 상태가 `DONE`이 되면 준비 완료.
- 상태는 컨테이너 안에만 있다(볼륨 없음). `down` 후 다시 `up` 하면 NiFi가 빈 흐름으로 처음부터 시작된다.
- 기동 확인: `scripts/smoke.sh` (앱 페이지, 시드 상태, NiFi REST로 `demo-flow`를 점검하고 실패 시 exit 1).

## 화면 구성

```
┌─ 메뉴 ──────────────────────────────────────────────────────── ? 도움말 ─┐
│ 본문: 입력 폼과 결과                              │ 도움말 (따로 스크롤)   │
│  실행한 클라이언트 코드 · 결과 JSON 또는 예외     │ 개념, 사용법,          │
│                                                   │ 따라 해 보기,          │
│ 이 화면에서 클라이언트가 보낸 요청                │ 같은 일을 하는 Java    │
│  # 클라이언트 메서드 경로 시도 상태 시간 (본문)   │ 코드                   │
└───────────────────────────────────────────────────┴────────────────────────┘
```

- **본문**: 각 메뉴의 입력 폼과 결과. 버튼을 누르면 결과 패널에 실행한 클라이언트 코드와 결과(JSON)가 나온다. 실패하면 `ApiException`, HTTP 상태(응답이 없으면 `getCode() = 0`), NiFi가 보낸 오류 메시지, 원인 예외가 나온다.
- **요청 표**: 그 화면(또는 그 동작)을 처리하면서 클라이언트가 보낸 HTTP 요청. 경로를 누르면 전체 URI와 요청·응답 본문이 펼쳐진다. 시도가 2 이상이면 같은 API 호출 안에서 다시 보낸 요청(토큰 만료 → 로그인 → 재전송), 빨간 행은 실패한 요청. 비밀번호는 가리고 토큰은 앞부분만 남긴다.
- **도움말**: 처음 쓰는 사람을 위한 설명. 본문과 따로 스크롤되고, 위쪽 "? 도움말" 버튼이나 × 로 숨긴다(브라우저에 기억). 화면 폭이 좁으면 본문 아래로 내려간다.
- **코드 표시와 편집기**: JSON·Java는 Monaco Editor로 보여주고 편집한다. webjar로 포함하므로 인터넷 연결이 없어도 된다.

## 메뉴

| 메뉴 | 확인할 수 있는 것 | 클라이언트 API |
|---|---|---|
| 대시보드 | 연결 정보(주소·인증서·토큰 만료), NiFi 버전, 현재 사용자, 컨트롤러 상태, 시스템 진단, bulletin, 시드 상태와 재실행, 수동 로그인 | `FlowApi`, `SystemDiagnosticsApi`, `AccessApi` |
| 프로세스 그룹 | 프로세서·연결·하위 그룹을 NiFi 캔버스 위치대로 그린 흐름 그림(큐 크기·상태 표시), 그룹 트리 이동(breadcrumb), 하위 그룹 생성, 모두 시작·정지, 모든 큐 비우기(비동기 요청), JSON 편집 저장, 삭제 | `FlowApi.getFlow`, `ProcessGroupsApi` |
| 프로세서 | 전체 프로세서 목록, 타입 검색 후 생성, 상세, 속성·스케줄 편집, 시작·정지·RUN_ONCE, 상태 조회, 삭제 | `ProcessorsApi`, `FlowApi.getProcessorTypes` |
| 연결·큐 | 전체 연결과 큐 크기, 연결 생성, FlowFile 목록(비동기 listing), FlowFile 속성·내용 보기, 큐 비우기, 설정 편집, 삭제 | `ConnectionsApi`, `FlowFileQueuesApi` |
| 컨트롤러 서비스 | 목록, 생성, 상세, 활성·비활성, 참조 컴포넌트, 편집, 삭제 | `ControllerServicesApi` |
| 파라미터 | 파라미터 컨텍스트 생성(민감 값 포함), 값 변경(비동기 update request), 그룹에 연결, 삭제 | `ParameterContextsApi` |
| 프로비넌스 | 검색 옵션, 컴포넌트별 이벤트 검색(비동기 query), 이벤트 상세, 입력·출력 내용 | `ProvenanceApi`, `ProvenanceEventsApi` |
| 플로우 정의 | 그룹을 flow definition JSON으로 내보내기, JSON을 새 그룹으로 업로드 | `ProcessGroupsApi.exportProcessGroup/uploadProcessGroup` |
| 장애 실험 | 토큰 만료 → 자동 재로그인, 1 ms read timeout, 오류 카탈로그(404·400·409·401·연결 실패), revision 충돌(낙관적 잠금) | 별도 `ApiClient`들, `ApiException` |
| 요청 기록 | 앱 전체의 최근 HTTP 시도(헬스 체크·시더 포함)와 본문, 최근 클라이언트 호출, Micrometer `nifi.client.requests` / `nifi.client.retries` 요약 | OkHttp 인터셉터 |

## 포트와 계정

| 서비스 | 주소 (호스트) | 계정 / 인증 |
|---|---|---|
| 데모 앱 | http://localhost:8080 | 없음 |
| NiFi UI | https://localhost:8443/nifi | `admin` / `nifi-demo-password` (자체 서명 인증서) |
| NiFi REST | https://localhost:8443/nifi-api | `POST /access/token`으로 받은 Bearer 토큰 |

### 다른 PC에서 접속하기

여러 사람이 같은 서버에 띄운 데모를 쓰려면 서버의 IP를 지정해서 띄운다. 예를 들어 서버 IP가 `192.168.0.10`이면:

```bash
BIND_ADDRESS=192.168.0.10 PUBLIC_HOST=192.168.0.10 docker compose up -d --build --wait
BIND_ADDRESS=192.168.0.10 scripts/smoke.sh
```

- 데모 앱은 `http://192.168.0.10:8080`, NiFi UI는 `https://192.168.0.10:8443/nifi`로 연다.
- `BIND_ADDRESS`는 포트를 열 주소(기본 `0.0.0.0` = 모든 인터페이스), `PUBLIC_HOST`는 브라우저가 쓰는 호스트 이름이나 IP다. NiFi는 Host 헤더를 확인하므로 `PUBLIC_HOST`가 맞지 않으면 UI가 "Invalid host header"로 거부한다(데모 앱은 영향 없음).
- 포트가 이미 쓰이고 있으면 `APP_PORT=18082 NIFI_PORT=18443`처럼 함께 지정한다.

포트·비밀번호는 `nifi-client-demo/.env`에서 바꾼다. 셸 환경변수가 `.env`보다 우선한다(예: `APP_PORT=18090 docker compose up -d --wait`).
비밀번호는 NiFi single-user 로그인 조건(12자 이상)을 맞춘 데모용 값이며, 로컬 테스트 전용이다.

## 앱만 따로 실행하기

앱 코드를 고치면서 확인할 때는 NiFi만 compose로 띄우고 앱은 호스트에서 실행한다(JDK 21, Maven 3.9).

```bash
cd nifi-client-demo && docker compose up -d --wait nifi
cd ../nifi-2.x/java && mvn install -DskipTests          # 생성된 클라이언트를 로컬 저장소에 설치
cd ../../nifi-client-demo/app
NIFI_PASSWORD=nifi-demo-password mvn spring-boot:run -Dspring-boot.run.profiles=local
```

`local` 프로파일은 `https://localhost:8443/nifi-api`를 쓴다. 컨테이너의 앱과 함께 띄우려면 `-Dspring-boot.run.arguments=--server.port=18080`처럼 포트를 바꾼다.
클라이언트를 다시 생성한 뒤 컨테이너 앱에 반영하려면 `docker compose up -d --build demo-app`.

## 문제 해결

| 증상 | 확인 |
|---|---|
| `up --wait`가 오래 걸림 | NiFi는 처음 뜰 때 인증서·흐름을 만들고 NAR를 풀어서 1–3분 걸린다. `docker compose ps`로 상태 확인 |
| 서비스가 unhealthy / exited | `docker compose logs nifi` (또는 `demo-app`). NiFi 상세 로그는 `docker compose exec nifi tail -n 100 logs/nifi-app.log` |
| 대시보드의 시드 데이터가 `FAILED` | 실패한 단계와 예외가 표시된다. NiFi가 늦게 뜬 경우 **시드 다시 실행**으로 재실행(모든 단계가 "이름으로 찾고 없으면 만들기") |
| 브라우저에서 NiFi UI가 인증서 경고 | 자체 서명 인증서다. 경고를 넘기고 접속한다. 앱은 `nifi.insecure-tls=true`로 검증을 끈다 |
| NiFi UI 접속 시 "Invalid host header" | NiFi는 `localhost:NIFI_PORT`와 `PUBLIC_HOST:NIFI_PORT`로 들어온 요청만 받는다. 브라우저 주소창의 호스트를 `PUBLIC_HOST`로 지정해 다시 `docker compose up -d` |
| 포트 충돌 | `.env`의 `*_PORT`를 바꾸거나 셸에서 `APP_PORT=... NIFI_PORT=...`를 지정 |
| Apple Silicon | `apache/nifi`, `maven`, `eclipse-temurin` 모두 arm64를 지원한다. 별도 설정 불필요 |
| 처음부터 다시 | `docker compose down && docker compose up -d --wait` |
