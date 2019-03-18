package com.zdhs.oms.consumer.serviceImpl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zdhs.oms.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Resource
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorMsg")
    @Override
    public String consumer() {
        restTemplate.getForObject("http://hello-service/hello", String.class);
        return "hello consumer finish!";
    }

    public String errorMsg(){
        return "这是个错误页面！--熔断器";
    }
}
