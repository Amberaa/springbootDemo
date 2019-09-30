package com.lxyy.demo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="developer")
@Data
@Component
public class DeveloperProperty {
    private String name;
    private String phone;
}
