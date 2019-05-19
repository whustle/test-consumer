package com.marstor.msa.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Jinhui
 * @Date 2019.5.19 23:17
 */
@FeignClient(name = "test-producer")
public interface FeignClients {
    @RequestMapping("/test")
    public String test();
}
