package com.sptech.school.bilhete.domain.auxiliar;

import com.sptech.school.bilhete.domain.Passagem;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class UsuarioAuxiliar {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false, length = 45)
  private String nome;

  @Column(nullable = false)
  @DateTimeFormat(pattern = "dd/MM/yyyy")
  private LocalDate dataNascimento;

  @Column(nullable = false, length = 20)
  private String cpf;

  @Column(nullable = false)
  @OneToMany(mappedBy = "usuarioAuxiliar")
  private List<PassagemAuxiliar> passagensAuxiliares;

  public UsuarioAuxiliar() {

  }

  public UsuarioAuxiliar(Integer id, String nome, LocalDate dataNascimento, String cpf, List<PassagemAuxiliar> passagensAuxiliares) {
    this.id = id;
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;
    this.passagensAuxiliares = passagensAuxiliares;
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

  public List<PassagemAuxiliar> getPassagensAuxiliares() {
    return passagensAuxiliares;
  }

  public void setPassagensAuxiliares(List<PassagemAuxiliar> passagensAuxiliares) {
    this.passagensAuxiliares = passagensAuxiliares;
  }
}
