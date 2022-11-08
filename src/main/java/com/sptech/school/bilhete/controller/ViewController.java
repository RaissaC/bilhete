package com.sptech.school.bilhete.controller;

import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.UsuarioServiceCreate;
import com.sptech.school.bilhete.service.dto.UsuarioCriacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class ViewController {

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private UsuarioServiceCreate usuarioServiceCreate;

  @GetMapping("/index")
  public String iniciarCadastro() {
    return "index";
  }

  @PostMapping("/cadastro")
  public String cadastroUsuario(UsuarioCriacaoDto usuarioCriacaoDto) {
    System.out.println(usuarioCriacaoDto);
    usuarioServiceCreate.criarUsuario(usuarioCriacaoDto);
    return "redirect:/lista-usuarios";
  }

  @GetMapping("/lista-usuarios")
  public String listarUsuarios(Model model) {
    model.addAttribute("usuarios", usuarioRepository.findAll());
    return "usuarios";
  }

}
