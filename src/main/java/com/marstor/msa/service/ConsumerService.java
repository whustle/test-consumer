package com.marstor.msa.service;

import com.marstor.msa.feign.FeignClients;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 * @Author Jinhui
 * @Date 2019.5.19 23:24
 */
@Service
public class ConsumerService {
    @Autowired
    private FeignClients feignClients;
    public String test(){
        System.out.println("before--------------");
        String str = feignClients.test();
        System.out.println("after-------------");
        return str;
    }
}
