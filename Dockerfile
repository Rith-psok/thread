
---- Discovery
docker build --no-cache \
  --build-arg GIT_BRANCH=release.v3.11.0 \
  --build-arg GIT_PASSWORD= \
  --build-arg GIT_USERNAME= \
  --build-arg PROFILE=build-service-discovery \
  --build-arg DISCOVERY_PORT=8761 \
  -f Dev.Dockerfile \
  -t registry.....:3.11.0 .


---- Server config
docker build --no-cache \
  --build-arg GIT_BRANCH=release.v3.11.0 \
  --build-arg GIT_PASSWORD= \
  --build-arg GIT_USERNAME= \
  --build-arg PROFILE=build-service-config \
  --build-arg SERVER_CONFIG_PORT=8895 \
  -f Dev.Dockerfile \
  -t registry....:3.11.0 .


docker build --no-cache \
  --build-arg GIT_BRANCH=release.v3.11.0 \
  --build-arg GIT_PASSWORD= \
  --build-arg GIT_USERNAME= \
  --build-arg PROFILE=build-file-manager \
  --build-arg SERVICE_ELFINDER_SERVER_PORT=8184 \
  -f Dev.Dockerfile \
  -t registry...:3.11.0


---- API
docker build --no-cache \
  --build-arg GIT_BRANCH=release.v3.11.0 \
  --build-arg GIT_PASSWORD= \
  --build-arg GIT_USERNAME= \
  --build-arg PROFILE=build-api \
  --build-arg SERVICE_PORT=8182 \
  -f Dev.Dockerfile \
  -t registry....:3.11.0 .


---- Gate way
docker build --no-cache \
  --build-arg GIT_BRANCH=release.v3.11.0 \
  --build-arg GIT_PASSWORD= \
  --build-arg GIT_USERNAME= \
  --build-arg PROFILE=build-gateway \
  --build-arg DISCOVERY_PORT=8998 \
  -f Dev.Dockerfile \
  -t registry...:3.11.0 .
