package com.sptech.school.bilhete.service.dto.usuario;


import com.sptech.school.bilhete.domain.Passagem;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class UsuarioRespostaDto implements Serializable {

  private Integer id;

  private String nome;

  private Date dataNascimento;

  private String cpf;

  private List<Passagem> tiposPassagem;

  public UsuarioRespostaDto() {

  }

  public UsuarioRespostaDto(Integer id, String nome, Date dataNascimento, String cpf, List<Passagem> tiposPassagem) {
    this.id = id;
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;
    this.tiposPassagem = tiposPassagem;
  }

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

  public Date getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public List<Passagem> getTiposPassagem() {
    return tiposPassagem;
  }

  public void setTiposPassagem(List<Passagem> tiposPassagem) {
    this.tiposPassagem = tiposPassagem;
  }
}
