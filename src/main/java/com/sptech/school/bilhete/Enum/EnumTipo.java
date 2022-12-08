package com.sptech.school.bilhete.Enum;

public enum EnumTipo {
  DINHEIRO("Dinheiro"),
  BILHETE("Bilhete");

  private String nome;

  public String getNome() {
    return nome;
  }

  EnumTipo(String nome) {
    this.nome = nome;
  }
}
