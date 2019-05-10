package com.zxgs.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient//将服务注册到服务注册中心
@MapperScan("com.zxgs.springcloud.mapper")
@SpringBootApplication
public class ProductProvider {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider.class, args);
    }
}
