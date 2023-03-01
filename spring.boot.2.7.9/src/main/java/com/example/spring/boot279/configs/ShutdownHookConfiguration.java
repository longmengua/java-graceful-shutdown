package com.example.spring.boot279.configs;

import com.example.spring.boot279.components.Component3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShutdownHookConfiguration {

    @Bean(destroyMethod = "destroy")
    public Component3 initializeBean3() {
        return new Component3();
    }
}
