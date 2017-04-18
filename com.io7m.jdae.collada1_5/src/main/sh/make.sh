#!/bin/sh

exec xjc \
  https://www.khronos.org/files/collada_schema_1_5 \
  -d ../java \
  -b ../jaxb/bindings.xjb
