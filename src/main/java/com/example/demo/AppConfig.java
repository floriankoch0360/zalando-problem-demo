package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.problem.jackson.ProblemModule;

@Configuration
public class AppConfig {
    @Bean
    public ObjectMapper objectMapper() {
        final var objectMapper = new ObjectMapper();
        objectMapper.registerModules(new ProblemModule());
        return objectMapper;
    }
}
