package com.training.simple_api.service;

import com.training.simple_api.model.Product;

import java.util.Optional;

public interface ProductService {
    Product saveProduct(Product product);
    Optional<Product> getProduct(long productId);
}
