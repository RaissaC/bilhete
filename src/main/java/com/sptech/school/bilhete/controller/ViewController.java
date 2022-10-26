package com.sptech.school.bilhete.controller;

import com.sptech.school.bilhete.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ViewController {

  @GetMapping("/cadastro")
  public String iniciarCadastro() {
    return "cadastro";
  }

  @PostMapping("/cadastro")
  public String cadastroUsuario(Usuario usuario) {
    return "redirect:/login";
  }

  @GetMapping("/login")
  public ModelAndView logarUsuario() {
    ModelAndView mv = new ModelAndView("login");
//    mv.addObject("usuar);
    return mv;
  }

}
