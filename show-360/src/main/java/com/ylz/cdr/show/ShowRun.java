package com.ylz.cdr.show;

import com.ylz.cdr.show.tool.SpringContextUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = {"classpath:config/application.properties"})
@SpringBootApplication
@ComponentScan({"com.ylz"})
@MapperScan({"com.ylz.*.*.dao", "com.ylz.*.dao"})
public class ShowRun {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ShowRun.class, args);
        SpringContextUtil.setApplicationContext(applicationContext);
    }
}

