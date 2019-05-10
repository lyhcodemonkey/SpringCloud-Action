package com.zxgs.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix //开启 Hystrix 熔断机制的支持
@EnableEurekaClient//将服务注册到服务注册中心
@MapperScan("com.zxgs.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8001_Hystrix {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001_Hystrix.class, args);
    }
}
