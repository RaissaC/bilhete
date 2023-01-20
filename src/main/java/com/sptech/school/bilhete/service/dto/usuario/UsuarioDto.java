package com.sptech.school.bilhete.service.dto.usuario;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class UsuarioDto {

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
  private String escolhaPassagens;


  public UsuarioDto(String nome, LocalDate dataNascimento, String cpf, String escolhaPassagens) {
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;
    this.escolhaPassagens = escolhaPassagens;
  }

  public UsuarioDto() {

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

  public String getEscolhaPassagens() {
    return escolhaPassagens;
  }

  public void setEscolhaPassagens(String escolhaPassagens) {
    this.escolhaPassagens = escolhaPassagens;
  }

}
