package com.sptech.school.bilhete.service.dto.usuario;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class UsuarioCriacaoDto{
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
  private String checkedPassagens;


  public UsuarioCriacaoDto(String nome, LocalDate dataNascimento, String cpf, String checkedPassagens) {
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;
    this.checkedPassagens = checkedPassagens;
  }

  public UsuarioCriacaoDto() {

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

  public String getCheckedPassagens() {
    return checkedPassagens;
  }

  public void setCheckedPassagens(String checkedPassagens) {
    this.checkedPassagens = checkedPassagens;
  }
}
