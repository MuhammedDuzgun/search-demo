package com.demo.search_demo.service;

import com.demo.search_demo.entity.Product;

import java.util.List;

public interface IProductService {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
