package com.example.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // marca la clase como tipo controlador
public class IndexController {

    // el controlador se encarga de controlar las peticiones del usuario
    @GetMapping(path = "/index")
    public String index() {

        return "index";
    }
}
