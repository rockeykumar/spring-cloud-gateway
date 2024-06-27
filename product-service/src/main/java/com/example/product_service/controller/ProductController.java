package com.example.product_service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private Environment environment;

    @GetMapping("/get")
    public String getEnvironmentDetails() {
        String res = "Got Product Details: " + environment.getProperty("local.server.port");
        System.out.println(res);
        return res;
    }
}
