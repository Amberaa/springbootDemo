package com.lxyy.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ValueController {

    //@Value方式
    @Value("${user.nickname}")
    private String userNickname;
    @Value("${user.phone}")
    private String userPhone;

    @GetMapping("/value")
    public String valueType() {
        System.out.println("@Value方式===user==" + userNickname);
        System.out.println("@Value方式===user==" + userPhone);
       return "@Value方式";
    }


}
