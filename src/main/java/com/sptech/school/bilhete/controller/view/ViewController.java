package com.sptech.school.bilhete.controller.view;

import com.sptech.school.bilhete.service.dto.UsuarioCriacaoDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class ViewController {

  @GetMapping("/index")
  public String index() {
    return "index";
  }

  @GetMapping("/cadastro")
  public String getCadastro() {
//    List<EnumTipo> listaTiposPassagens = new ArrayList<>(List.of(EnumTipo.values()));
//    model.addAttribute("tipoPassagens", listaTiposPassagens);
    return "cadastro";
  }


  @GetMapping("/login")
  public void getLogin(@Valid UsuarioCriacaoDto usuarioCriacaoDto) {

//    usuarioCriacaoDto.getNome().length() < 5 ? return "login" : return "";

  }
}
