package com.jl.shopping.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")

public class PruebaController {

    @GetMapping
    public String prueba (@RequestParam String nombre) {
        return "Bienvenido a Java " + nombre;
    }


    @GetMapping("/otro/{nombre}")
    public String prueba2 (@PathVariable("nombre") String nombre) {
        return "Bienvenido a Spring " + nombre;
    }
}


