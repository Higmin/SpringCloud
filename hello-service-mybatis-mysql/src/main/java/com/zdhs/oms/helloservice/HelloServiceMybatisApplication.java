package com.zdhs.oms.helloservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.zdhs.oms.helloservice.dao")

public class HelloServiceMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloServiceMybatisApplication.class, args);
    }

}
