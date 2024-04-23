package com.example.kiemtrab2.utils;

import com.example.kiemtrab2.model.Product;

import java.util.List;

public interface IFileReader {
    List<Product> readFile(String path);

}
