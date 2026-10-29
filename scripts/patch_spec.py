#!/usr/bin/env python3
"""NiFi 2.x OpenAPI 스펙을 코드 생성에 맞게 보정한다.

사용법: patch_spec.py <input swagger.json> <output swagger.json>

1. 파라미터 래퍼 스키마(LongParameter, ClientIdParameter, ...)를 원시 타입으로 바꾼다.
   NiFi는 쿼리/경로 파라미터를 문자열로 받아 래퍼 객체로 변환하는데, 스펙에는 객체로
   나와 있어서 생성된 클라이언트가 "class LongParameter {...}" 같은 값을 보낸다.
2. swagger-core가 붙인 operationId 접미사(_1, _2, ...)를 뗀다.
   태그(API 클래스)가 다르면 이름이 겹쳐도 문제가 없고, 접미사는 버전마다 바뀐다.
3. /access/token 폼 필드 순서를 username, password로 맞춘다.
"""
import json
import re
import sys
from collections import Counter

WRAPPER_TYPES = {
    "LongParameter": {"type": "integer", "format": "int64"},
    "IntegerParameter": {"type": "integer", "format": "int32"},
    "ClientIdParameter": {"type": "string"},
    # NiFi 고유 포맷(MM/dd/yyyy HH:mm:ss)이라 date-time으로 두지 않는다.
    "DateTimeParameter": {"type": "string"},
    "BulletinBoardPatternParameter": {"type": "string"},
}


def operations(spec):
    for path_item in spec["paths"].values():
        for method, op in path_item.items():
            if isinstance(op, dict) and "operationId" in op:
                yield op


def unwrap_parameters(spec):
    count = 0
    for op in operations(spec):
        for param in op.get("parameters", []):
            ref = param.get("schema", {}).get("$ref", "")
            name = ref.rsplit("/", 1)[-1]
            if name in WRAPPER_TYPES:
                param["schema"] = dict(WRAPPER_TYPES[name])
                count += 1
    unknown = sorted({p["schema"]["$ref"] for op in operations(spec) for p in op.get("parameters", [])
                      if p.get("schema", {}).get("$ref", "").endswith("Parameter")})
    if unknown:
        sys.exit("unhandled parameter wrapper schemas: %s" % unknown)
    return count


def strip_operation_id_suffix(spec):
    ops = list(operations(spec))
    stripped = [(re.sub(r"_\d+$", "", op["operationId"]), (op.get("tags") or [""])[0]) for op in ops]
    dup = [k for k, v in Counter(stripped).items() if v > 1]
    if dup:
        sys.exit("operationId collision within tag after stripping suffix: %s" % dup)
    count = 0
    for op, (op_id, _) in zip(ops, stripped):
        if op["operationId"] != op_id:
            op["operationId"] = op_id
            count += 1
    return count


def order_login_form(spec):
    body = spec["paths"]["/access/token"]["post"]["requestBody"]
    schema = body["content"]["application/x-www-form-urlencoded"]["schema"]
    props = schema["properties"]
    schema["properties"] = {k: props[k] for k in ("username", "password")}


def main():
    src, dst = sys.argv[1], sys.argv[2]
    with open(src) as f:
        spec = json.load(f)
    params = unwrap_parameters(spec)
    op_ids = strip_operation_id_suffix(spec)
    order_login_form(spec)
    with open(dst, "w") as f:
        json.dump(spec, f, indent=2)
    print("patched: %d parameters, %d operationIds -> %s" % (params, op_ids, dst))


if __name__ == "__main__":
    main()
