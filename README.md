Modified Spring Tutorial to use Jade - [Designing and Implementing a Web Application with Spring](http://spring.io/guides/tutorials/web/1/)
---

This is a modification of the original tutorial to use Jade as the templating language instead of Thymeleaf. Makes use of the [spring-jade4j](https://github.com/neuland/spring-jade4j) library.

The form validation is using a work-around to pass the BindingResult into the model. Ideally it would be nice handle that in a more native way and keep Spring dependencies out of the CustomerInfo model.
