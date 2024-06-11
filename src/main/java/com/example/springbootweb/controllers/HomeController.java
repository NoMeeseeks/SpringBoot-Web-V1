package com.example.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //para redirigir a una ruta aparte
//    @GetMapping("/")
//    public String home(){
//        return "redirect:/app/index";
//    }

    //para redirigir a una ruta de pagina web
//    @GetMapping("/")
//    public String home(){
//        return "redirect:https:www.google.com";
//    }

    //para redirigir a una ruta aparte sin reiniciar la pagina todos los datos se mantienen del request
    //solo a rutas de controladores
    @GetMapping("/")
    public String home(){
        return "forward:/app/index";
    }
}
