# jjj

**jjj** is an example of RESTful Server application using **J**ersey, **J**etty, and **J**ackson.

Feel free to take this project as a starting point when building a RESTful server.

---

You can find a naïve example on how to use **jjj** under jjj-example. The example can also be run using Docker. 

```
$ docker build -t jjj_example .
$ docker run -p 0.0.0.0:8082:8082 jjj_example
```

---

Run `mvn dependency:analyze` to analyze this project maven dependencies.

### Alternatives

- [Dropwizard](https://github.com/dropwizard/dropwizard)
- [Play Framework](https://www.playframework.com/)
- [RestExpress](https://github.com/RestExpress)
