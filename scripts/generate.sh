#!/usr/bin/env bash
# NiFi swagger.json으로 Java/Python 클라이언트를 생성한다.
# 사용법: scripts/generate.sh <nifi-1.x|nifi-2.x>
# 버전 정보는 <dir>/versions.env 에 있다.
set -euo pipefail

LINE="${1:?usage: scripts/generate.sh <nifi-1.x|nifi-2.x>}"
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
DIR="$ROOT/$LINE"
[ -f "$DIR/versions.env" ] || { echo "versions.env not found: $DIR" >&2; exit 1; }
# shellcheck disable=SC1091
source "$DIR/versions.env"

SPEC="$DIR/swagger/$NIFI_VERSION/swagger.json"
JAR="$ROOT/.codegen/swagger-codegen-cli-$CODEGEN_VERSION.jar"

[ -f "$SPEC" ] || { echo "swagger.json not found: $SPEC" >&2; exit 1; }

# 원본 스펙을 그대로 쓸 수 없는 버전(2.x)은 보정한 사본으로 생성한다.
if [ "${CODEGEN_FIXES:-false}" = "true" ]; then
  mkdir -p "$ROOT/.codegen"
  PATCHED="$ROOT/.codegen/$LINE-swagger.json"
  python3 "$ROOT/scripts/patch_spec.py" "$SPEC" "$PATCHED"
  SPEC="$PATCHED"
fi

if [ ! -f "$JAR" ]; then
  mkdir -p "$(dirname "$JAR")"
  curl -sSfL -o "$JAR" \
    "https://repo1.maven.org/maven2/$CODEGEN_GROUP_PATH/swagger-codegen-cli/$CODEGEN_VERSION/swagger-codegen-cli-$CODEGEN_VERSION.jar"
fi

for lang in java python; do
  rm -rf "$DIR/$lang"
  java -jar "$JAR" generate -i "$SPEC" -l "$lang" -c "$DIR/config/$lang.json" -o "$DIR/$lang"
done

# swagger-codegen 3.x Python 템플릿은 응답 bytes를 디코딩하지 않아서
# text/plain 응답(예: /access/token)이 "b'...'" 문자열로 돌아온다.
if [ "${CODEGEN_FIXES:-false}" = "true" ]; then
  py_api_client="$DIR/python/swagger_client/api_client.py"
  grep -q '^            data = response.data$' "$py_api_client"
  sed -i 's|^            data = response.data$|            data = response.data\n            if isinstance(data, bytes):\n                data = data.decode("utf-8")|' "$py_api_client"
fi

# Java 타깃 버전을 맞춘다 (codegen 기본값은 1.8).
sed -i "s|<java.version>1.8</java.version>|<java.version>$JAVA_RELEASE</java.version>|" "$DIR/java/pom.xml"
if [ -f "$DIR/java/build.gradle" ]; then
  sed -i "s|JavaVersion.VERSION_1_8|JavaVersion.VERSION_$JAVA_RELEASE|" "$DIR/java/build.gradle"
fi

# Python 버전을 고정한다.
PY_MINOR="${PYTHON_VERSION#*.}"
PY_NEXT="${PYTHON_VERSION%%.*}.$((PY_MINOR + 1))"
sed -i "s|^    install_requires=REQUIRES,|    python_requires=\">=$PYTHON_VERSION,<$PY_NEXT\",\n    install_requires=REQUIRES,|" "$DIR/python/setup.py"
sed -i "s|^envlist = .*|envlist = py${PYTHON_VERSION/./}|" "$DIR/python/tox.ini"
echo "$PYTHON_VERSION" > "$DIR/python/.python-version"
