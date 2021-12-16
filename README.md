# about

A simple spring-boot webapp to validate the Oauth2 provided by CAS Server.

# Howto

```
./mvnw spring-boot:run
```

then load http://127.0.0.1:8080/oauth2/authorization/cas
This should redirect to the CAS from the docker composition.

# CAS service

CAS will need to be configured so that it accepts external services to connect onto it. Depending on how it has been set up, the method can vary. Below is the JSON spec I am using with the JSON service registry:

```
$ cat oauth2-2001.json 
{
  "@class" : "org.apereo.cas.support.oauth.services.OAuthRegisteredService",
  "clientId": "external-oauth2",
  "clientSecret": "aaaa",
  "serviceId" : "^(https|http)://.*",
  "name" : "oauth2",
  "id" : 2001
}

```

# documentation

https://docs.spring.io/spring-security/site/docs/5.2.12.RELEASE/reference/html/oauth2.html#oauth2login-advanced-login-page
