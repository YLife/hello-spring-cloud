package com.yl.hello.spring.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/sayHi")
    public String sayHi(@RequestParam(value = "message") String message) {
        return String.format("Hi, your message is: %s, port is: %s", message, port);
    }
}
