package com.sptech.school.bilhete.domain;

import com.sptech.school.bilhete.Enum.EnumTipo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Passagem {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(nullable = false, updatable = false)
  private EnumTipo tipo;

  @ManyToOne(optional = true, fetch = FetchType.LAZY)
  private Usuario usuario;

  @OneToMany(mappedBy = "passagem")
  private List<Bilhete> bilhetes;

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
