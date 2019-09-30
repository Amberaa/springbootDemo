package com.lxyy.demo.controller;

import com.lxyy.demo.properties.ApplicationProperty;
import com.lxyy.demo.properties.DeveloperProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PropertyController {
    @Autowired
    private ApplicationProperty applicationProperty;
    @Autowired
    private DeveloperProperty developerProperty;

    @GetMapping("/two")
    public String properties(){

        System.out.println("@Value方式===" + applicationProperty);
        System.out.println("@ConfigurationProperties方式===" + developerProperty);
        return "yes";
    }
}
