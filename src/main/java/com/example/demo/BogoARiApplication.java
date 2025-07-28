package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // Auditing 설정 적용 애너테이션
public class BogoARiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BogoARiApplication.class, args);
    }

}
