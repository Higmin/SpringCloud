package com.zdhs.oms.feign.controller;

import com.zdhs.oms.feign.service.FeignConsumerService;
import com.zdhs.oms.helloserviceapi.UserEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/feign-service")
public class FeignConsumerController {

    @Resource
    FeignConsumerService feignConsumerService;

    @RequestMapping("/hello")
    public String feignConsumer(){
        feignConsumerService.hello();
        System.out.println("feign-consumer--------------------controller");
        return "feign consumer call finished!";
    }

    @RequestMapping(value = "/hello5",method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
    public String feignHello5(){
       return feignConsumerService.hello5();
    }

    @RequestMapping(value = "/hello6",method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
    public UserEntity feignUser(@RequestBody UserEntity user){
        return feignConsumerService.printUser(user);
    }

}
