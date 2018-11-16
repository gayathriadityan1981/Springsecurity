package com.springSecurity.onlineFoodOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer; 

@SpringBootApplication
public class OnlineFoodOrderApplication extends SpringBootServletInitializer {
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(OnlineFoodOrderApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(OnlineFoodOrderApplication.class, args);
	}
}
