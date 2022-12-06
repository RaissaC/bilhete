package com.sptech.school.bilhete.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(nullable = false, length = 45)
  private String nome;


  @Column(nullable = false)
  @DateTimeFormat(pattern = "dd/MM/yyyy")
  private LocalDate dataNascimento;

  @Column(nullable = false, length = 20)
  private String cpf;

  @Column(nullable = false, length = 20)
  private String tipoPassagem;

//    @OneToMany(mappedBy = "usuario")
//    private List<Passagem> tiposPassagem;

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

//  public List<Passagem> getTiposPassagem() {
//    return tiposPassagem;
//  }
//
//  public void setTiposPassagem(List<Passagem> tiposPassagem) {
//    this.tiposPassagem = tiposPassagem;
//  }
}
