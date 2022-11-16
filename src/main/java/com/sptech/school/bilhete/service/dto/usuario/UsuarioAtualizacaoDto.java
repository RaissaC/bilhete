package com.sptech.school.bilhete.service.dto.usuario;

import com.sun.istack.NotNull;

import java.io.Serializable;
import java.time.LocalDate;

public class UsuarioAtualizacaoDto implements Serializable {

  @NotNull
  private Integer id;

  @NotNull
  private String nome;

  @NotNull
  private LocalDate dataNascimento;

  @NotNull
  private String cpf;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public UsuarioAtualizacaoDto(Integer id, String nome, LocalDate dataNascimento, String cpf) {
    this.id = id;
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;
  }
}
