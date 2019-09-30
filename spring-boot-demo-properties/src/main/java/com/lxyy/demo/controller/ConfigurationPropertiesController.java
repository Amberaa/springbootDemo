package com.lxyy.demo.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一种方式：使用@ConfigurationProperties注解将配置文件属性注入到配置对象类中
 */
@ConfigurationProperties(prefix="user")
@Data
@RestController
public class ConfigurationPropertiesController {

    private String nickname;
    private String phone;


    @GetMapping("/configuration")
    public String ConfigurationPropertiesType(){
        System.out.println("@ConfigurationProperties方式=====" + nickname);
        System.out.println("@ConfigurationProperties方式=====" + phone);

        return "@ConfigurationProperties方式";
    }
}
