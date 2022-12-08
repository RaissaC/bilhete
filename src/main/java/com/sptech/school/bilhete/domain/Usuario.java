package com.sptech.school.bilhete.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
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

  @OneToMany(mappedBy = "usuario")
  private List<Passagem> tiposPassagens = new ArrayList<>();

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

  public List<Passagem> getTipoPassagens() {
    return tiposPassagens;
  }

  public void setTiposPassagens(List<Passagem> tiposPassagens) {
    this.tiposPassagens = tiposPassagens;
  }
}
