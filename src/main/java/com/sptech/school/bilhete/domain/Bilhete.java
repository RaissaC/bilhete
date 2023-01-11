package com.sptech.school.bilhete.domain;

import com.sptech.school.bilhete.Enum.EnumCategoria;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Bilhete {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private LocalDateTime dataCriacao;

  @Column(nullable = false, updatable = false)
  private EnumCategoria categoria;

  @ManyToOne(fetch = FetchType.LAZY)
  private Passagem passagem;

  public Bilhete(Integer id, LocalDateTime dataCriacao, EnumCategoria categoria, Passagem passagem) {
    this.id = id;
    this.dataCriacao = dataCriacao;
    this.categoria = categoria;
    this.passagem = passagem;
  }

  public Bilhete() {

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDateTime getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(LocalDateTime dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public EnumCategoria getCategoria() {
    return categoria;
  }

  public void setCategoria(EnumCategoria categoria) {
    this.categoria = categoria;
  }

  public Passagem getPassagem() {
    return passagem;
  }

  public void setPassagem(Passagem passagem) {
    this.passagem = passagem;
  }
}
