package com.sptech.school.bilhete.domain;

import com.sptech.school.bilhete.Enum.EnumTipo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Passagem {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(nullable = false, updatable = false)
  private String tipo;

  @ManyToOne(fetch = FetchType.LAZY)
  private Usuario usuario;

  @OneToMany
  private List<Bilhete> bilhetes;

  //falta vincular os tipos de bilhetes
  public Passagem(Integer id, String tipo, Usuario usuario) {
    this.id = id;
    this.tipo = tipo;
    this.usuario = usuario;
//    this.bilhetes = bilhetes;
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

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public List<Bilhete> getBilhetes() {
    return bilhetes;
  }

  public void setBilhetes(List<Bilhete> bilhetes) {
    this.bilhetes = bilhetes;
  }

}
