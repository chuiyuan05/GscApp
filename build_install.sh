#!/usr/bin/env bash
gradle assembleDebug
adb install -r Gsc/build/outputs/apk/Gsc-debug-unaligned.apk
