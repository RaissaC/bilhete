package com.sptech.school.bilhete.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

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

  @NotNull
  private String escolhaPassagens;

//  @OneToMany(mappedBy = "usuario")
//  private List<Passagem> passagens;

  public Usuario() {
  }

  public Usuario(Integer id, String nome, LocalDate dataNascimento, String cpf, List<String> tiposPassagens) {
    this.id = id;
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;
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

  //  public List<Passagem> getPassagens() {
//    return passagens;
//  }
//
//  public void setPassagens(List<Passagem> passagens) {
//    this.passagens = passagens;
//  }

}
