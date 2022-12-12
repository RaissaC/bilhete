package com.sptech.school.bilhete.service.dto.usuario;

import com.sptech.school.bilhete.Enum.EnumTipo;
import com.sptech.school.bilhete.domain.Passagem;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class UsuarioCriacaoDto implements Serializable {
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
  @NotEmpty(message = "O usuário deve conter ao menos um tipo de passagem")
  private List<EnumTipo> tiposPassagem;
  @NotNull
  @NotEmpty(message = "O usuário deve conter ao menos um tipo de passagem")
  private List<Passagem> passagens;

  public UsuarioCriacaoDto(String nome, LocalDate dataNascimento, String cpf, List<String> tiposPassagem) {
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;
    this.passagens = passagensUsuario(tiposPassagem);
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

  public List<EnumTipo> getTiposPassagem() {
    return tiposPassagem;
  }

  public void setTipoPassagem(List<EnumTipo> tiposPassagem) {
    this.tiposPassagem = tiposPassagem;
  }

  public List<Passagem> getTiposPassagens() {
    return passagens;
  }

  public void setTiposPassagens(List<Passagem> tiposPassagens) {
    this.passagens = tiposPassagens;
  }

  @Override
  public String toString() {
    return "UsuarioCriacaoDto{" +
        "nome='" + nome + '\'' +
        ", dataNascimento=" + dataNascimento +
        ", cpf='" + cpf + '\'' +
        ", tiposPassagens='" + passagens + '\'' +
        '}';
  }
}
