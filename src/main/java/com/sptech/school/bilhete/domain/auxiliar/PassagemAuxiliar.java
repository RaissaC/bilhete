package com.sptech.school.bilhete.domain.auxiliar;

import javax.persistence.*;

@Entity
public class PassagemAuxiliar {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false, updatable = false)
  private String tipo;


  @ManyToOne
  private UsuarioAuxiliar usuarioAuxiliar;


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
}
