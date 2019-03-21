package com.zdhs.oms.helloservice.controller;


import com.zdhs.oms.helloservice.helloservice.UserService;
import com.zdhs.oms.helloserviceapi.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**controller
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/query/{age}")
    public UserEntity findByIdUser(@PathVariable("age") Integer age) {
        UserEntity us = userService.findUser(age);
        return us;
    }

    @RequestMapping(value = "/del/{age}")
    public String delUser(@PathVariable("age") Integer age) {
        int num = userService.deleteUser(age);
        return num == 1 ? "succ" : "err";
    }

    @RequestMapping(value = "/save/{name}/{age}")
    public String delUser(@PathVariable("name") String name, @PathVariable("age") Integer age) {
        UserEntity user = new UserEntity();
        user.setName(name);
        user.setAge(age);
        int num = userService.saveUser(user);
        return num == 1 ? "succ" : "err";
    }

}

