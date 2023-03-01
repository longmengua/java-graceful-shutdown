package com.example.spring.boot279.components;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Component1 {
    @PreDestroy
    public void destroy() {
        System.out.println(
                "Callback triggered - @PreDestroy.");
    }
}
