#! /bin/bash

rm -rf target/
rm simplecrypto.jar

find app -name "*.java" | xargs javac -d target

cd target && jar cvfm simplecrypto.jar ../manifest.txt $(find . -name "*.class" | tr '\n' ' ')