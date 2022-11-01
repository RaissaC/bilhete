package com.sptech.school.bilhete.domain;

import com.sptech.school.bilhete.Enum.EnumTipo;
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
public class Passagem {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private EnumTipo tipo;

  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  private Usuario usuario;

  @OneToMany(mappedBy = "passagem")
  private List<Bilhete> bilhetes;


}