#!/usr/bin/env bash
# Smoke test for the demo stack: run after `docker compose up -d --wait` (from nifi-client-demo/).
# Checks the app pages, the seed status, and that the seeded demo-flow group exists in NiFi.
# Ports and credentials follow nifi-client-demo/.env; override with BIND_ADDRESS / APP_PORT / NIFI_PORT / NIFI_USERNAME / NIFI_PASSWORD.
set -uo pipefail

cd "$(dirname "$0")/.."
# Values from .env unless already set in the environment (same precedence as docker compose).
for var in BIND_ADDRESS APP_PORT NIFI_PORT NIFI_USERNAME NIFI_PASSWORD; do
  [[ -z "${!var:-}" && -f .env ]] && declare "$var=$(grep -E "^$var=" .env | cut -d= -f2-)"
done
# Published on every interface -> localhost, otherwise only on BIND_ADDRESS.
HOST=${BIND_ADDRESS:-0.0.0.0}; [[ $HOST == 0.0.0.0 ]] && HOST=localhost
APP="http://$HOST:${APP_PORT:-8080}"
NIFI="https://$HOST:${NIFI_PORT:-8443}/nifi-api"
TIMEOUT=${SMOKE_TIMEOUT:-300}

fail=0
check() {  # check <name> <command...>
  local name=$1; shift
  if out=$("$@" 2>&1); then
    echo "ok    $name"
  else
    echo "FAIL  $name"; echo "$out" | head -5 | sed 's/^/      /'; fail=1
  fi
}

echo "Waiting for $APP/actuator/health/readiness (up to ${TIMEOUT}s)..."
for ((i = 0; i < TIMEOUT; i += 5)); do
  curl -sf "$APP/actuator/health/readiness" >/dev/null && break
  sleep 5
done

# The seeder runs in the background after startup; wait for it so the data checks below are meaningful.
for ((i = 0; i < 180; i += 5)); do
  page=$(curl -sf "$APP/") && grep -qE '>(DONE|FAILED)<' <<<"$page" && break
  sleep 5
done

check "app health"   curl -sf "$APP/actuator/health"
for path in / /groups /processors /queues /services /parameters /provenance /flows /lab /calls; do
  check "GET $path" curl -sf -o /dev/null "$APP$path"
done
check "seed status DONE" bash -c "curl -sf '$APP/' | grep -q '>DONE<'"

# Self-signed certificate, hence -k.
token=$(curl -skf -X POST "$NIFI/access/token" --data-urlencode "username=${NIFI_USERNAME:-admin}" \
  --data-urlencode "password=${NIFI_PASSWORD:-}")
check "NiFi: login" test -n "$token"
check "NiFi: demo-flow exists" bash -c "curl -skf -H 'Authorization: Bearer $token' '$NIFI/flow/process-groups/root' | grep -q '\"name\":\"demo-flow\"'"

if ((fail)); then echo "Smoke test FAILED"; exit 1; fi
echo "Smoke test passed"
