package com.example.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {

    @GetMapping("/")
    public String variables(Model model) {
        return "variables/index";
    }

    @GetMapping("/string/{texto}")
    public String variables(
            @PathVariable String texto,
            @PathVariable(name = "texto") String texto2,
            Model model
    ) {
        model.addAttribute("resultado", "El texto enviado es: " + texto);
        return "variables/ver";
    }

    @GetMapping("/string/{texto}/{numero}")
    public String variables(
            @PathVariable String texto,
            @PathVariable(name = "texto") String texto2,
            @PathVariable Integer numero,
            Model model
    ) {
        model.addAttribute("resultado", "El texto enviado es: " + texto + " y el numero escogido es: " + numero);
        return "variables/ver";
    }
}
