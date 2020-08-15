package com.ylz.hf.sync;

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
@MapperScan({"com.ylz.person.dao"})
public class SyncData {
    public static void main(String[] args) {
        SpringApplication.run(SyncData.class, args);
    }
}
