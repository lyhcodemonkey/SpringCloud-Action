package com.zxgs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient    //标识为一个eureka客户端
@SpringBootApplication
public class ProductConsumer_80 {

    public static void main(String[] args) {

        SpringApplication.run(ProductConsumer_80.class, args);
    }

}
