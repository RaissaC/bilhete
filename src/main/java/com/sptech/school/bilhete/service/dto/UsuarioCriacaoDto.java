package com.sptech.school.bilhete.service.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import java.util.Date;

public class UsuarioCriacaoDto {

  @Column(nullable = false, updatable = false)
  private String nome;

  @Column(nullable = false, updatable = false)
  @DateTimeFormat(pattern = "dd/MM/yyyy")
  private Date dataNascimento;

  @Column(nullable = false, updatable = false)
  private String cpf;

}
