package com.example.productoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productos")

public class ProductoController {
    @GetMapping
    public  String test(){
        return "Hola mundo";
    }
}
