package com.example.spring.boot279.components;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class Component2 implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println(
                "Callback triggered - DisposableBean.");
    }
}
