package com.sptech.school.bilhete.service.dto;

import com.sptech.school.bilhete.Enum.EnumTipo;
import com.sun.istack.NotNull;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsuarioCriacaoDto implements Serializable {
  @NotNull
  private String nome;
  @NotNull
  private LocalDate dataNascimento;
  @NotNull
  private String cpf;

  @NotNull
  private List<EnumTipo> tiposPassagem;

  public UsuarioCriacaoDto(String nome, LocalDate dataNascimento, String cpf) {
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;
    this.tiposPassagem = new ArrayList<>(List.of(EnumTipo.values()));
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public String toString() {
    return "[UsuarioCriacaoDto]" +
        "\nnome: " + nome + "\ndataNascimento: " + dataNascimento + "\ncpf: " + cpf;
  }

  public List<EnumTipo> getTiposPassagem() {
    return tiposPassagem;
  }

  public void setTiposPassagem(List<EnumTipo> tiposPassagem) {
    this.tiposPassagem = tiposPassagem;
  }
}
