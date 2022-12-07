package com.sptech.school.bilhete.service.dto.usuario;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

public class UsuarioAtualizacaoDto implements Serializable {

  @NotNull
  private Integer id;
  @NotNull
  @NotEmpty(message = "O campo deve ser preenchido com o nome completo do usuário")
  @Size(min = 3, max = 250)
  private String nome;

  @NotNull
  @NotEmpty(message = "O campo deve ser preenchido com a data de nascimento do usuário")
  private LocalDate dataNascimento;

  @NotNull
  @NotEmpty(message = "O campo deve ser preenchido com o CPF do usuário")
  @Size(min = 10, max = 15, message = "O cpf deve ser completo")
  private String cpf;

  @NotNull
  @NotEmpty(message = "O campo deve conter o tipo de passagem utilizada mensalmente")
  private String tipoPassagem;

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

  public String getTipoPassagem() {
    return tipoPassagem;
  }

  public void setTipoPassagem(String tipoPassagem) {
    this.tipoPassagem = tipoPassagem;
  }

  public UsuarioAtualizacaoDto(Integer id, String nome, LocalDate dataNascimento, String cpf, String tipoPassagem) {
    this.id = id;
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;
    this.tipoPassagem = tipoPassagem;
  }
}
