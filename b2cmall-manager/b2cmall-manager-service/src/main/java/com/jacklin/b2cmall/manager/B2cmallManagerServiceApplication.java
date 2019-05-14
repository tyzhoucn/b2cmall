package com.jacklin.b2cmall.manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.jacklin.b2cmall.manager.mapper")
@SpringBootApplication
public class B2cmallManagerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run (B2cmallManagerServiceApplication.class, args);
    }

}
