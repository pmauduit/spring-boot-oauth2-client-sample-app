# about

A simple spring-boot webapp to validate the Oauth2 provided by CAS Server.

# Howto

```
./mvnw spring-boot:run
```

then load http://127.0.0.1:8080/oauth2/authorization/cas
This should redirect to the CAS from the docker composition.

# TODO

Still missing some configuration from CAS, as when the redirection occurs, CAS
indicates that the remote service is not authorized to use it.

# documentation

https://docs.spring.io/spring-security/site/docs/5.2.12.RELEASE/reference/html/oauth2.html#oauth2login-advanced-login-page
