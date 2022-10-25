package com.sptech.school.bilhete.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BilheteController {

  @GetMapping
  public String abrirPagina(){
    return "olá";
  }
}
