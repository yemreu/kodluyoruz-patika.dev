##### Dockerfile
```dockerfile
FROM node:14-slim
WORKDIR /opt/node-server
COPY app/ .
RUN npm install
CMD ["node","app.js"]
```

##### docker-compose.yml
```yaml
version: "3.4"
services:
  node-server:
    container_name: my-server
    build: .
    ports:
      - 3001:3000
```

