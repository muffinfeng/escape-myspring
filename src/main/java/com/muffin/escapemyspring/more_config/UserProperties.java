package com.muffin.escapemyspring.more_config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ToString
@ConfigurationProperties(prefix = "escape.user")
public class UserProperties {

    private String name;
    private Integer age;
}
