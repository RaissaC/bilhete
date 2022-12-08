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
  private EnumTipo tipo;

  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  private Usuario usuario;

  @OneToMany(mappedBy = "passagem")
  private List<Bilhete> bilhetes;

  public Passagem(Integer id, EnumTipo tipo, Usuario usuario, List<Bilhete> bilhetes) {
    this.id = id;
    this.tipo = tipo;
    this.usuario = usuario;
    this.bilhetes = bilhetes;
  }

  public Passagem() {

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public EnumTipo getTipo() {
    return tipo;
  }

  public void setTipo(EnumTipo tipo) {
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
