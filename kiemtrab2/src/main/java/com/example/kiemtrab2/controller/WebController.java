package com.example.kiemtrab2.controller;

import com.example.kiemtrab2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class WebController {
    @Autowired
    private ProductService productService;



   @GetMapping("/product")
    public String getAllProduct(Model model,
                            @RequestParam(required = false, defaultValue = "1") int page,
                            @RequestParam(required = false, defaultValue = "10") int pageSize) {
        model.addAttribute("pageData", productService.getAllProduct(page, pageSize));
        return "product";
    }
}
