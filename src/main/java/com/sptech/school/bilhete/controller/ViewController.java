package com.sptech.school.bilhete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/criarPagina")
public class ViewController {

  @GetMapping
  public String criarPagina(){
    return "central";
  }


}
