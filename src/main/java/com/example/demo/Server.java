package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class Server {

    private static ApplicationContext ctx;

    public static ApplicationContext applicationContext() {
        return ctx;
    }

    public static void main(final String[] args) {
        final SpringApplication springApplication = new SpringApplication(Server.class);
        ctx = springApplication.run(args);
    }
}
