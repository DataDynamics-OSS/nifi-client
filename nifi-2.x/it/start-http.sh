#!/bin/sh
# apache/nifi 2.x 이미지는 HTTPS로만 시작한다. 통합 테스트용으로 무인증 HTTP 모드로 바꿔서 시작한다.
# 이미지의 start.sh를 복사해 NiFi 실행 직전에 HTTP 설정을 덮어쓴다.
set -e
cp /opt/nifi/scripts/start.sh /tmp/start-http.sh
sed -i 's|^"${NIFI_HOME}/bin/nifi.sh" run &|. /opt/nifi/it/unsecure.sh\n&|' /tmp/start-http.sh
exec /bin/bash /tmp/start-http.sh
