package com.sptech.school.bilhete.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoPassagem {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String tipo;

}
