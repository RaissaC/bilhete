package com.sptech.school.bilhete.controller.view;

import com.sptech.school.bilhete.Enum.EnumTipo;
import com.sptech.school.bilhete.service.UsuarioServiceCreate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class ViewController {

  private UsuarioServiceCreate usuarioServiceCreate;

  @GetMapping("/index")
  public String index() {
    return "index";
  }

  @GetMapping("/cadastro")
  public String getCadastro(Model model) {
    List<EnumTipo> tiposPassagens = List.of(EnumTipo.values());
    model.addAttribute("tiposPassagens", tiposPassagens);
    return "cadastro";
  }


  @GetMapping("/login")
  public String getLogin() {
    return "login";
  }
}
