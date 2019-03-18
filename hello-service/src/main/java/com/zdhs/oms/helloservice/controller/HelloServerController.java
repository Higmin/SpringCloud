package com.zdhs.oms.helloservice.controller;

import com.zdhs.oms.helloserviceapi.HelloServiceApi;
import com.zdhs.oms.helloserviceapi.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RequestMapping("/hello-service")
@RestController
public class HelloServerController implements HelloServiceApi{

    Logger logger = LoggerFactory.getLogger(HelloServerController.class);

    @Resource
    DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String hello(){
        logger.info("hello-server服务*************"+discoveryClient);
        //用于测试,后期删除
        System.out.println("hello-server服务*************"+discoveryClient);
        return "hello ,this is hello-server";
    }

    @RequestMapping(value = "/hello1" , method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    public String hello1(@RequestParam String name){

        return "Hello1--------"+name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    public UserEntity hello2(@RequestParam String name,@RequestParam Integer age){

        return new UserEntity(name,age);
    }

    //JSON格式接收
    @RequestMapping(value = "/hello3", method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
    public String hello3(@RequestBody UserEntity user){

        return "hello3****************"+user.getName()+user.getAge();
    }

    @RequestMapping(value = "/hello5",method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
    @Override
    public String hello5() {
        return "hello-----this is hello5";
    }

    @RequestMapping(value = "/hello6",method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
    @Override
    public UserEntity printUser(@RequestBody UserEntity user) {
        return user;
    }

}
