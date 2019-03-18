package com.zdhs.oms.feign.service;

import com.zdhs.oms.feign.RemoteHystrix.HelloRemoteHystrix;
import com.zdhs.oms.helloserviceapi.HelloServiceApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 通过@FeignClient注解绑定服务名，这里服务名不区分大小写
 * 然后再通过@RequestMapping来绑定服务下的rest接口
 */
@FeignClient(value = "hello-service", fallback = HelloRemoteHystrix.class)
public interface FeignConsumerService extends HelloServiceApi {

    @RequestMapping("/hello")
    String hello();
}
