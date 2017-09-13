#!/usr/bin/env bash
set -e

FRAMEWORK_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
BUILD_DIR=$FRAMEWORK_DIR/build/distributions
export TOOLS_DIR=$FRAMEWORK_DIR/tools
export GOARCH="amd64"
export S3_BUCKET="bwood-mesoscon-tutorial"

REPO_NAME=banana BOOTSTRAP_DIR="disable" EXECUTOR_DIR="disable" \
         $FRAMEWORK_DIR/tools/build_framework.sh \
         memcache \
         $FRAMEWORK_DIR \
         --artifact "$BUILD_DIR/memcache-scheduler.zip" \
         $@
