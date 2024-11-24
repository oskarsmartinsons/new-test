package com.training.simple_api.service;

import com.training.simple_api.model.Product;
import com.training.simple_api.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        System.out.println("Saving product: " + product);
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> getProduct(long productId) {
        System.out.println("Getting product with ID: " + productId);
        return Optional.of(productRepository.findById(productId))
                       .orElseThrow(()-> new IllegalArgumentException("Product not found"));
    }
}
