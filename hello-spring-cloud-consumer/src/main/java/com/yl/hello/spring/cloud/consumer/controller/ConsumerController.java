package com.yl.hello.spring.cloud.consumer.controller;

import com.yl.hello.spring.cloud.consumer.feign.IRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerController {

    @Autowired
    private IRemoteService remoteService;

    @RequestMapping("/sayHi")
    public String sayHi(@RequestParam(value = "message") String message) {
        return remoteService.sayHi(message);
    }
}
