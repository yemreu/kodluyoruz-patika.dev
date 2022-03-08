##### Dockerfile
```dockerfile
FROM node:14-slim
WORKDIR /opt/node-todo-app
COPY app/ .
RUN npm install
CMD ["node","app.js"]
```

##### docker-compose.yml

```yaml
version: "3.4"
services:
  todo-app:
    container_name: dc-todo-app
    build: .
    ports:
      - 3000:3000
  mongodb:
    image: mongo
    ports:
      - 27017:27017
    volumes:
      - todo-app-data:/data/db
volumes:
  todo-app-data:
```
