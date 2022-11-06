package com.sptech.school.bilhete.service.dto;

import com.sptech.school.bilhete.domain.Passagem;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class UsuarioCriacaoDto implements Serializable {

  @NotNull
  private String nome;

  @NotNull
  private Date dataNascimento;

  @NotNull
  private String cpf;

//  @NotNull
//  private List<Passagem> tiposPassagem;
}
