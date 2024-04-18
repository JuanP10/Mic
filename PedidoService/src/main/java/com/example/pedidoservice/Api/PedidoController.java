package com.example.pedidoservice.Api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    @GetMapping
    public  String test(){
        return "Hola mundo jsjsjs";
    }
}
