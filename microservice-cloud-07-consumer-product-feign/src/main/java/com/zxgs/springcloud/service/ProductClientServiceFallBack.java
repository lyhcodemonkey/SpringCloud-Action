package com.zxgs.springcloud.service;

import com.zxgs.springcloud.entity.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Component
public class ProductClientServiceFallBack implements ProductClientService{
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    @Override
    public Product get(Long id) {
        return new Product(id, "id="+ id + "无数据--feign&hystrix", "无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }

    @Override
    public boolean add(Product product) {
        return false;
    }
}
