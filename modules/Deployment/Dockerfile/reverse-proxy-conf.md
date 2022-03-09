```
server {
  listen 80;
  listen [::]:80;
  server_name abc.com;
  server_name_in_redirect off;
  
  access_log /var/log/nginx/reverse-access.log;
  error_log /var/log/nginx/reverse-error.log;
  
  location / {
    proxy_set_header Client-IP $remote_addr;
    proxy_set_header X-Forwarded-For $proxy_addr_x_forwarded_for;
    proxy_set_header Host $host;
    proxy_pass http://127.0.0.1:8080;
  }
```
