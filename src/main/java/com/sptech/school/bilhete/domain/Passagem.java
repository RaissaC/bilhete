package com.sptech.school.bilhete.domain;

import com.sptech.school.bilhete.Enum.EnumTipo;

import javax.persistence.*;

@Entity
public class Passagem {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

//  @Enumerated(EnumType.STRING)
  @Column(nullable = false, updatable = false)
  private String tipo;

  public Passagem(Integer id, String tipo) {
    this.id = id;
    this.tipo = tipo;
  }

  public Passagem() {

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  //  @OneToMany(mappedBy = "passagem")
//  private List<Bilhete> bilhetes;

}
