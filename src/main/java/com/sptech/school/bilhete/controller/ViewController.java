package com.sptech.school.bilhete.controller;

import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.UsuarioServiceCreate;
import com.sptech.school.bilhete.service.dto.UsuarioCriacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ViewController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioServiceCreate usuarioServiceCreate;

    @GetMapping("/cadastro")
    public String iniciarCadastro() {
        return "cadastro";
    }

    @PostMapping("/cadastro-usuario")
    public String cadastroUsuario(UsuarioCriacaoDto usuarioCriacaoDto) {
        usuarioServiceCreate.criarUsuario(usuarioCriacaoDto);
        return "redirect:/lista-usuarios";
    }

    @GetMapping("/lista-usuarios")
    public ModelAndView listarUsuarios() {
        ModelAndView mv = new ModelAndView("usuarios");
        mv.addObject("usuarios", usuarioRepository.findAll());
        return mv;
    }

}
