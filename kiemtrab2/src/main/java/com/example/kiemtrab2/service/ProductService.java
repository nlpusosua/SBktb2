package com.example.kiemtrab2.service;

import com.example.kiemtrab2.model.Product;
import com.example.kiemtrab2.response.PageResponse;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    PageResponse<Product> getAllProduct(int page, int pageSize);
}
