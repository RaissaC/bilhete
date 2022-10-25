package com.sptech.school.bilhete.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/criarPagina")
public class CentralController {

  @GetMapping
  public String criarPagina(){
    return "central";
  }


}
