package com.example.spring.boot279;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Waltor
 * @Topic Graceful shutdown in spring boot base project.
 * @Reference
 * 	- https://www.baeldung.com/spring-boot-web-server-shutdown
 * 	- https://www.springcloud.io/post/2022-02/spring-boot-graceful-shutdown/#gsc.tab=0
 * */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("执行 ShutdownHook ...");
			}
		}));
	}

}
