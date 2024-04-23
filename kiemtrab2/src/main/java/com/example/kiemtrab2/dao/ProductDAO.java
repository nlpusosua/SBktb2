package com.example.kiemtrab2.dao;

import com.example.kiemtrab2.model.Product;

import java.util.List;

public interface ProductDAO {
    void printListPeople(List<Product> products);

    List<Product> getAll();
}
