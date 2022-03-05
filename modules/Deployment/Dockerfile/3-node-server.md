```dockerfile
FROM node:14-slim
WORKDIR /opt/node-server
COPY . .
RUN npm install
CMD ["node","app.js"]
```

> .dockerignore -> node_modules/
