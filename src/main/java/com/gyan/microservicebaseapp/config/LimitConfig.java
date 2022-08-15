package com.gyan.microservicebaseapp.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ConfigurationProperties("limit-service")
@Component
public class LimitConfig {
    private int min;
    private int max;
}
