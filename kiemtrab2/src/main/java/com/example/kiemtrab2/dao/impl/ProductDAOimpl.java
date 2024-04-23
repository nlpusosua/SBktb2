package com.example.kiemtrab2.dao.impl;

import com.example.kiemtrab2.dao.ProductDAO;
import com.example.kiemtrab2.database.ProductDB;
import com.example.kiemtrab2.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductDAOimpl implements ProductDAO {
    @Override
    public void printListPeople(List<Product> products) {

    }

    @Override
    public List<Product> getAll() {
        return ProductDB.products;
    }
}
