package com.thagul.testcbr4j;

import feign.Feign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignCircuitBreaker;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
public class Testcbr4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(Testcbr4jApplication.class, args);
    }
    
    @Bean
    public Feign.Builder circuitBreakerFeignBuilder() {
        return FeignCircuitBreaker.builder();
    }

}
