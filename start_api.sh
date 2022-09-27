docker build  --no-cache -t "api" -f api/Dockerfile .
docker run api -p 8080:8080
