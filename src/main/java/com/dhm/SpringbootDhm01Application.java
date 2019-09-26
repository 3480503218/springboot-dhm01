package com.dhm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//关闭自动配置@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class SpringbootDhm01Application {


    public static void main(String[] args) {
        SpringApplication.run(SpringbootDhm01Application.class, args);
    }

}
