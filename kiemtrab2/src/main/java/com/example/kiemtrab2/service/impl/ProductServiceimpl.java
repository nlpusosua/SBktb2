package com.example.kiemtrab2.service.impl;

import com.example.kiemtrab2.dao.ProductDAO;
import com.example.kiemtrab2.model.Product;
import com.example.kiemtrab2.response.PageResponse;
import com.example.kiemtrab2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceimpl implements ProductService {
    @Autowired
    private ProductDAO productDAO;
    @Override
    public List<Product> getAllProduct() {
        return productDAO.getAll();
    }

    @Override

    public PageResponse<Product> getAllProduct(int page, int pageSize) {
        return new PageResponse<>(productDAO.getAll(), page, pageSize);
    }
}
