package com.myproject.springbootpractise;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        String s = "Hello world";
        return s;
    }
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello from the bean!");
    }

}
