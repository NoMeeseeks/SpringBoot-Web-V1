package com.example.springbootweb.controllers;

import org.apache.coyote.Request;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.html.parser.Entity;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

    @GetMapping("/")
    public String index() {
        return "params/index";
    }

    @GetMapping("/String")
    public String param(
            @RequestParam(name = "texto",required = false) String texto,
            Model model){
        model.addAttribute("resultado","El text es "+texto);
        return "params/ver";
    }

    @GetMapping("/mix-params")
    public String param(
            @RequestParam(name = "texto",required = false) String texto,
            @RequestParam(name = "numero",required = false) Integer numero,
            Model model){
        model.addAttribute("resultado","El text es "+texto + " y el numero es: " + numero);
        return "params/ver";
    }

    @GetMapping("/enviarUsuario")
    public ResponseEntity<?> LeerNombre(
            @RequestParam(name = "nombre") String nombre
    ){
        return ResponseEntity.ok("Bienvenido " + nombre + " a tu web");
    }
}
