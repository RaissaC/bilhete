package com.sptech.school.bilhete.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Historico {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private LocalDateTime dataCriacao;

  
}
