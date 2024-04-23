package com.example.kiemtrab2.database;

import com.example.kiemtrab2.model.Product;
import com.example.kiemtrab2.utils.IFileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDB implements CommandLineRunner {
    @Autowired
    private IFileReader iFileReader;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Khởi tạo dữ liệu");
        ProductDB.products = iFileReader.readFile("product.json");

        for (Product product : ProductDB.products) {
            System.out.println(product);
        }

        System.out.println("số lượng sản phẩm: " + ProductDB.products.size());
    }
}
