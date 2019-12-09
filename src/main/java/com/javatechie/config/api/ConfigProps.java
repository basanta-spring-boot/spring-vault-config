package com.javatechie.config.api;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("javatechie")
public class ConfigProps {
    private String username;
    private String password;
}
