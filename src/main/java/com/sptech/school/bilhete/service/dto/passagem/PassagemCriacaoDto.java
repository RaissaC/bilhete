package com.sptech.school.bilhete.service.dto.passagem;

import com.sptech.school.bilhete.Enum.EnumTipo;
import com.sptech.school.bilhete.domain.Bilhete;
import com.sptech.school.bilhete.domain.Usuario;
import com.sun.istack.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PassagemCriacaoDto implements Serializable {

  @NotNull
  private EnumTipo tipo;

  @NotNull
  private Usuario usuario;

  private List<Bilhete> bilhetes;

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

  public PassagemCriacaoDto(EnumTipo tipo, Usuario usuario) {
    this.tipo = tipo;
    this.usuario = usuario;
    this.bilhetes = new ArrayList<>();
  }
}
