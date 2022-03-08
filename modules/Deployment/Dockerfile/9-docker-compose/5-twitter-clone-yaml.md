##### Dockerfile
```dockerfile
FROM node:14.15-slim
WORKDIR /opt/twitter-clone
COPY . .

ENV ACCESS_TOKEN_SECRET=
ENV REFRESH_TOKEN_SECRET=
ENV AWS_ID=
ENV AWS_SECRET=
ENV AWS_BUCKET_NAME=
ENV PASSWORD_HASH=
ENV PORT=3000

RUN npm install
CMD ["npm","start"]
```

##### docker-compose.yml
```yaml
version: "3.4"
services:
  twitter-app:
    build: .
    ports:
      - 3000:3000
    depends_on:
      - mongodb
      - redis
  mongodb:
    image: mongo:latest
    ports:
      - 27017:27017
    volumes:
      - data:/data/db
  redis:
    image: redis
    ports:
      - 6379:6379
volumes:
  data:
```
