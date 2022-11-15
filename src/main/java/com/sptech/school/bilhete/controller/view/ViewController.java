package com.sptech.school.bilhete.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {


    @GetMapping("/getIndex")
    public String index() {
        return "index";
    }

    @GetMapping("/getCadastro")
    public String getCadastro() {
        return "cadastro";
    }


    @GetMapping("/getLogin")
    public String getLogin() {
        return "login";
    }


}
