package com.example.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // marca la clase como tipo controlador
public class IndexController {

    // el controlador se encarga de controlar las peticiones del usuario
    @GetMapping(path = "/index")
    public String index(ModelMap model) {
        // Con el Model model se puede enviar datos por medio de llave valor a la vista en este caso es el attribute con dos argumentos
        // tiene la misma funcion
        // Con el ModelMap es una clase que va a heredar de una clase map

        //Tambien se puede usar Map y se indica los tipos de datos Map<String, object>map y tiene el metodo put

        //ModelAndView con el metodo es addObject le podemos asignar el normbre de la vista a cargar

        model.addAttribute("titulo","SpringWeb");

        return "index";
    }
}
