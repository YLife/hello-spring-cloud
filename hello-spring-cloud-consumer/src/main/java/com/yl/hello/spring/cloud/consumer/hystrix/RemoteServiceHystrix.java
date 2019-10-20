package com.yl.hello.spring.cloud.consumer.hystrix;

import com.yl.hello.spring.cloud.consumer.feign.IRemoteService;
import org.springframework.stereotype.Component;

@Component
public class RemoteServiceHystrix implements IRemoteService {

    @Override
    public String sayHi(String message) {
        return String.format("Hi, your message is: %s, but remote server is not available.", message );
    }
}
