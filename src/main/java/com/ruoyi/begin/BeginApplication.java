package com.ruoyi.begin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ruoyi.begin.Dao")
@SpringBootApplication
public class BeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeginApplication.class, args);
    }

}
