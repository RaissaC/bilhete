package com.sptech.school.bilhete.controller.view;

import com.sptech.school.bilhete.Enum.EnumTipo;
import com.sptech.school.bilhete.domain.Passagem;
import com.sptech.school.bilhete.service.dto.UsuarioCriacaoDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class ViewController {

  @GetMapping("/index")
  public String index() {
    return "index";
  }

  @GetMapping("/cadastro")
  public String getCadastro(Model model) {
    List<EnumTipo> listaTiposPassagens = new ArrayList<>(List.of(EnumTipo.values()));
    model.addAttribute("tipoPassagens", listaTiposPassagens);
    return "cadastro";
  }


  @GetMapping("/login")
  public String getLogin() {
    return "login";
  }


}
