package com.lxyy.demo.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 第二种方式：通过@Value("${propertyName}方式读取配置文件
 */
@Data
@Component
public class ApplicationProperty {
    @Value("${developer.name}")
    private String applicationName;
    @Value("${developer.phone}")
    private String applicationVersion;
}
