package com.sptech.school.bilhete.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bilhete {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private LocalDateTime emissao;

  @Column(nullable = false, updatable = false)
  private String categoria;

  @Column(nullable = false, updatable = false)
  private String tipoPublico;

  private String empresa;
}
