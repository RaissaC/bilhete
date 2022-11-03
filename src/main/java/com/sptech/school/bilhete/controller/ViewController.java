package com.sptech.school.bilhete.controller;

import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.repository.UsuarioRepository;
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

  @GetMapping("/cadastro")
  public String iniciarCadastro() {
    return "cadastro";
  }

  @PostMapping("/cadastro-usuario")
  public String cadastroUsuario(Usuario usuario) {
    usuarioRepository.save(usuario);
    return "redirect:/lista-usuarios";
  }

  @GetMapping("/lista-usuarios")
  public ModelAndView listarUsuarios() {
    ModelAndView mv = new ModelAndView();
    mv.addObject("usuarios", usuarioRepository.findAll());
    return mv;
  }



}
