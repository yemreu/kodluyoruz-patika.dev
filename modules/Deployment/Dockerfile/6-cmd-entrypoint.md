```dockerfile
FROM ubuntu:18.04
CMD ["sleep","4"]
# CMD sleep 4
```

```dockerfile
FROM ubuntu:18.04
ENTRYPOINT ["sleep"]
```

```dockerfile
FROM ubuntu:18.04
ENTRYPOINT ["sleep"]
# Default
CMD ["2"]
```
