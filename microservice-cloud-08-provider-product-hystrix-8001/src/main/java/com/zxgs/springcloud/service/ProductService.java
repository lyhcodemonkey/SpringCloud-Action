package com.zxgs.springcloud.service;

import com.zxgs.springcloud.entity.Product;

import java.util.List;

public interface ProductService {
    boolean add(Product product);

    Product get(Long id);

    List<Product> list();
}
