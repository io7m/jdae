#!/bin/sh

exec xjc \
  https://www.khronos.org/files/collada_schema_1_4 \
  -disableXmlSecurity \
  -d ../java \
  -b ../jaxb/bindings.xjb
