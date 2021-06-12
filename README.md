# Clone project
```bash
git clone https://github.com/SeifBh/spring-project
```

# Run project

First of all, you need to move cloud-conf project to your c:/users/{yourname}

After that, respect this order to run the project

1. Run service-config project
2. Run service-register project
3. Run service-proxy project
4. Run admin-server project


# Hosts and ports 

- Eureka : http://localhost:8762/
- Gateway : http://localhost:8083/
- Spring admin dashboard : http://localhost:9091/


# Problem : cannot access to spring dashboard from gateway , it doest not load 

`dashboard:1 Access to XMLHttpRequest at 'http://localhost:9091/applications' from origin 'http://localhost:8083' has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource.`


- Spring dashboard from gateway : http://localhost:8083/admin/dashboard

