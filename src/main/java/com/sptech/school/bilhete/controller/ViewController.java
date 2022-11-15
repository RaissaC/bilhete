package com.sptech.school.bilhete.controller;

import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.UsuarioServiceCreate;
import com.sptech.school.bilhete.service.dto.UsuarioCriacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioServiceCreate usuarioServiceCreate;

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

    @GetMapping("/getUsuarios")
    public String usuarios(Model model) {
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "usuarios";
    }

    @PostMapping("/cadastro")
    public String cadastrarUsuario(UsuarioCriacaoDto usuarioCriacaoDto) {
        usuarioServiceCreate.criarUsuario(usuarioCriacaoDto);
        return "usuarios";
    }


}
