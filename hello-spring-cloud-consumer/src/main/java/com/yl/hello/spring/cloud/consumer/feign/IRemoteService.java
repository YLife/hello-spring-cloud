package com.yl.hello.spring.cloud.consumer.feign;

import com.yl.hello.spring.cloud.consumer.hystrix.RemoteServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-provider", fallback = RemoteServiceHystrix.class)
public interface IRemoteService {

    @RequestMapping("/sayHi")
    String sayHi(@RequestParam(value = "message") String message);
}
