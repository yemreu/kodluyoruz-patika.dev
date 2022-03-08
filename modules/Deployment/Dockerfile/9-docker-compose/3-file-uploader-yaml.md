##### Dockerfile
```dockerfile
FROM node:14-slim
WORKDIR /uploader-app
COPY app/ .
RUN npm install
EXPOSE 3000
CMD ["node","server.js"]
```

##### docker-compose.yml
```yaml
version: "3.4"
services:
  uploader-app:
    build: .
    ports:
      - 3000:3000
    volumes:
      - uploader-app-uploads:/uploads
volumes:
  uploader-app-uploads:
```
