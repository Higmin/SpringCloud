package com.zdhs.oms.feign.RemoteHystrix;

import com.zdhs.oms.feign.service.FeignConsumerService;
import com.zdhs.oms.helloserviceapi.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements FeignConsumerService {
    @Override
    public String hello() {
        return "hello,this messge send failed-------1 ";
    }

    @Override
    public String hello5() {
        return "hello,this messge send failed------5 ";
    }

    @Override
    public UserEntity printUser(UserEntity user) {
        return null;
    }
}
