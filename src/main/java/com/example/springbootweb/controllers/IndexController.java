package com.example.springbootweb.controllers;

import com.example.springbootweb.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller // marca la clase como tipo controlador
@RequestMapping("/app")//como mapear el controlador con request mapping agregando una ruta base a todos los metodos
public class IndexController {

    // el controlador se encarga de controlar las peticiones del usuario
    @GetMapping(path = "/home")
    public String index(Model model) {
        // Con el Model model se puede enviar datos por medio de llave valor a la vista en este caso es el attribute con dos argumentos
        // tiene la misma funcion
        // Con el ModelMap es una clase que va a heredar de una clase map

        //Tambien se puede usar Map y se indica los tipos de datos Map<String, object>map y tiene el metodo put

        //ModelAndView con el metodo es addObject para agregar los datos y le podemos asignar el normbre de la vista a cargar con set viewname

        model.addAttribute("titulo","SpringWeb");

        return "index";
    }

    @RequestMapping(method = RequestMethod.GET,path = "/perfil")
    public String perfil(Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("Xavier");
        usuario.setApellido("Santamaria");
usuario.setEmail("Xavier@gmail.com");
        model.addAttribute("usuario",usuario);
        model.addAttribute("titulo","Usuario: ".concat(usuario.getNombre()));
        return "perfil";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/listar")
    public String listar(Model model){
//        List<Usuario> usuarios = new ArrayList<>();
//        usuarios.add(new Usuario("Xavier","Santamaria","xavi@gmail.com"));
//        usuarios.add(new Usuario("Luis","Coro","xavi21313@gmail.com"));
//        usuarios.add(new Usuario("Pepe","Cadena","xavi2121fds@gmail.com"));
//        usuarios.add(new Usuario("Carlos","Francis","xavnfakldf0113i@gmail.com"));
        model.addAttribute("titulo","Lista de usuarios");
//        model.addAttribute("usuarios",usuarios);
        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Xavier","Santamaria","xavi@gmail.com"));
        usuarios.add(new Usuario("Luis","Coro","xavi21313@gmail.com"));
        usuarios.add(new Usuario("Pepe","Cadena","xavi2121fds@gmail.com"));
        usuarios.add(new Usuario("Carlos","Francis","xavnfakldf0113i@gmail.com"));
        return usuarios;
    }
}
