package com.jl.shopping.controller;

import com.jl.shopping.entities.Facturacion;
import com.jl.shopping.entities.Usuario;
import com.jl.shopping.repositories.FacturacionRepository;
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
        List<Usuario> usuarios = usuarioRepository.findAll();

        return usuarios;
    }

    @GetMapping
    public Usuario prueba (@RequestParam String nombre) {
        Usuario usuario = new Usuario();
        usuario.setIdCliente(1);
        usuario.setNombre("Jose");
        return usuario;
    }



    @Autowired
    private FacturacionRepository facturacionRepository;


    @GetMapping("/facturacion")
    public List<Facturacion> getFacturacion () {
        List<Facturacion> facturas = facturacionRepository.findAll();

        return facturas;
    }







}


