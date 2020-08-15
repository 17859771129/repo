package com.ylz.cdr.write;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@PropertySource(value = {"classpath:config/application.properties"})
@SpringBootApplication
@EnableScheduling
@ComponentScan({"com.ylz"})
@MapperScan({"com.ylz.cdr.*.dao", "com.ylz.*.dao"})
public class WriteRun {
    public static void main(String[] args) {
        SpringApplication.run(WriteRun.class, args);
    }
}

