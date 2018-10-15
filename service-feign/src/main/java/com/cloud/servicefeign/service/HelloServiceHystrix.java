package com.cloud.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements   HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry  error" + name;
    }
}
