package com.sptech.school.bilhete.mapper;

import com.sptech.school.bilhete.domain.Passagem;
import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.repository.PassagemRepository;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioCriacaoDto;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioAtualizacaoDto;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

  @Autowired
  PassagemRepository passagemRepository = null;

  @Autowired
  UsuarioCriacaoDto usuarioCriacaoDto = null;

  Usuario toDomain(UsuarioCriacaoDto usuarioCriacaoDto);

  Usuario toDomain(UsuarioAtualizacaoDto usuarioAtualizacaoDto);

  static List<Passagem> listarPassagens(String escolhasPassagen) {
    List<String> passagensEscolhidas = Arrays.stream(usuarioCriacaoDto.getEscolhaPassagens().split(",")).collect(Collectors.toList());
    List<Passagem> byTipoIn = passagemRepository.findByTipoIn(passagensEscolhidas);
    return byTipoIn;
  }
}
