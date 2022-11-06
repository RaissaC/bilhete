package com.sptech.school.bilhete.domain;

import com.sptech.school.bilhete.Enum.EnumCategoria;
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

  private LocalDateTime dataCriacao;

  @Column(nullable = false, updatable = false)
  private EnumCategoria categoria;

  @ManyToOne(optional = true, fetch = FetchType.LAZY)
  private Passagem passagem;
}
