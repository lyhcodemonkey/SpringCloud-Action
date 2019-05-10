package com.zxgs.springcloud.service;

import com.zxgs.springcloud.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//指定调用的服务 MICROSERVICE-PRODUCT
@FeignClient(value = "MICROSERVICE-PRODUCT",fallback = ProductClientServiceFallBack.class)
public interface ProductClientService {
    @RequestMapping(value = "/product/get/{id}",method = RequestMethod.GET)
    Product get(@PathVariable("id")Long id);
    @RequestMapping(value = "/product/list",method = RequestMethod.GET)
    List<Product> list();
    @RequestMapping(value = "/product/add",method = RequestMethod.POST)
    boolean add(Product product);
}

