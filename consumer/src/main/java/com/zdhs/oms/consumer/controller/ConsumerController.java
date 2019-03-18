package com.zdhs.oms.consumer.controller;

import com.zdhs.oms.consumer.service.ConsumerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    ConsumerService consumerService;

    @RequestMapping("/hello-consumer")
    public String helloConsumer(){
      return consumerService.consumer();
    }

}
