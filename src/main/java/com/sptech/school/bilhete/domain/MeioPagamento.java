package com.sptech.school.bilhete.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class MeioPagamento {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  private Usuario usuario;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  private Passagem passagem;

  public MeioPagamento(Integer id, Usuario usuario, Passagem passagem) {
    this.id = id;
    this.usuario = usuario;
    this.passagem = passagem;
  }

  public MeioPagamento() {

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public Passagem getPassagem() {
    return passagem;
  }

  public void setPassagem(Passagem passagem) {
    this.passagem = passagem;
  }
}
