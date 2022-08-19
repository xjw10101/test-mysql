package com.xjw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@MapperScan("com.xjw.dao")
@SpringBootApplication
public class TestMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMysqlApplication.class, args);
    }

}
