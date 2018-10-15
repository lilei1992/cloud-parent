package com.cloud.servicefeign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",fallback = HelloServiceHystrix.class)
public interface HelloService {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
     String sayHiFromClientOne(@RequestParam(value = "name") String name);



}
