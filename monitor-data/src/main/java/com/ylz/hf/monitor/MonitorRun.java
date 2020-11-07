package com.ylz.hf.monitor;
//test
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = {"classpath:config/application.properties"})
@SpringBootApplication
@ComponentScan({"com.ylz"})
@MapperScan({"com.ylz.hf.monitor.mapper"})
public class MonitorRun {
    public static void main(String[] args) {
        SpringApplication.run(MonitorRun.class, args);
    }
}

