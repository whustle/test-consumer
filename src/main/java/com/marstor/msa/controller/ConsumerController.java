package com.marstor.msa.controller;

import com.marstor.msa.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jinhui
 * @Date 2019.5.19 23:28
 */
@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;
    @RequestMapping("/test")
    public String test(){
        String str = consumerService.test();
        System.out.println("---------");
        return str;
    }
    @RequestMapping("/")
    public String test1(){
        return "consumer";
    }
}
