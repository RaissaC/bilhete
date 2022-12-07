package com.sptech.school.bilhete.service.dto.usuario;


import com.sptech.school.bilhete.domain.Passagem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class UsuarioRespostaDto implements Serializable {

    private Integer id;

    private String nome;

    private Date dataNascimento;

    private String cpf;

    private List<Passagem> tiposPassagem;
}
