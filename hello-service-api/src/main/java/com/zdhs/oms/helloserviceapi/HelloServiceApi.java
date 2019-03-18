package com.zdhs.oms.helloserviceapi;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface HelloServiceApi {

    @RequestMapping(value = "/hello-service/hello5",method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
    public String hello5();

    @RequestMapping(value = "/hello-service/hello6",method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
    public UserEntity printUser(@RequestBody UserEntity user);
}
