package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controlador {

    @GetMapping("/Aprendiz")
    public String mostrarInfo(){
        return "Primer microservicio";
    }

    @PostMapping("/Suma")
    public Integer suma(int x , int y){
        return x + y;
    }
}
