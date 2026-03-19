package com.example.MASCOTAS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "PI Mascotas funcionando correctamente 🚀, despues de cuatro dias de estar fregando con render hasta mi targeta de credito tube que poner para terminarlo  correctamente \uD83D\uDE0E";
    }
}