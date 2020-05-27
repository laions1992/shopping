package com.jl.shopping.controller;

import com.jl.shopping.entities.Usuario;
import com.jl.shopping.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")

public class PruebaController {
    @Autowired
    private UsuarioRepository usuarioRepository;


    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios () {
        List<Usuario> usuarios = usuarioRepository.all();

        return usuarios;
    }

    @GetMapping
    public Usuario prueba (@RequestParam String nombre) {
        Usuario usuario = new Usuario();
        usuario.setIdCliente(1);
        usuario.setNombre("Jose");
        return usuario;
    }


    @GetMapping("/otro/{nombre}")
    public String prueba2 (@PathVariable("nombre") String nombre) {
        return "Bienvenido a Spring " + nombre;
    }



}


