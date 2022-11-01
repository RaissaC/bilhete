package com.sptech.school.bilhete.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(nullable = false, updatable = false)
  private String nome;

  @Column(nullable = false, updatable = false)
  private String dataNascimento;

  @Column(nullable = false, updatable = false)
  private String cpf;

  @OneToMany(mappedBy = "usuario")
  private List<Passagem> tiposPassagem;

}
