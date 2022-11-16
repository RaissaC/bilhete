package com.sptech.school.bilhete.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/cadastro")
    public String getCadastro() {
        return "cadastro";
    }


    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }


}
