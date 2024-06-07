package com.example.springbootweb.controllers;

import org.apache.coyote.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

    @GetMapping("/String")
    public String param(
            @RequestParam(name = "texto",required = false) String texto,
            Model model){
        model.addAttribute("resultado","El text es "+texto);
        return "params/ver";
    }

    @GetMapping("/enviarUsuario")
    public String LeerNombre(
            @RequestParam(name = "nombre") String nombre
    ){
        return "Bienvenido " + nombre;
    }
}
