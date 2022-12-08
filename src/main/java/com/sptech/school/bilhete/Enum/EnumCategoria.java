package com.sptech.school.bilhete.Enum;

public enum EnumCategoria {
  TOP,
  UNICO,
  ONPAG;

  private Double valor;

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }
}
