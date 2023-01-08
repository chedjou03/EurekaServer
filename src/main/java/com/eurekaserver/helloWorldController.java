package com.eurekaserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @GetMapping(value = "/hellos")
    public String sayHello(){
        return "Hello World";
    }
}
