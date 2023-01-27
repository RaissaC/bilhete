package com.sptech.school.bilhete.service;

import com.sptech.school.bilhete.domain.EscolhaPassagem;
import com.sptech.school.bilhete.domain.Passagem;
import com.sptech.school.bilhete.mapper.UsuarioConfigMapper;
import com.sptech.school.bilhete.repository.EscolhaPassagemRepository;
import com.sptech.school.bilhete.repository.PassagemRepository;
import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceExclusao {

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private EscolhaPassagemRepository escolhaPagamentoRepository;

  @Autowired
  private PassagemRepository passagemRepository;

  @Autowired
  private UsuarioConfigMapper usuarioConfigMapper;

  //TERMINAR ESSE MÉTODO
  public void excluir(UsuarioDto usuarioDto) {

    List<Passagem> passagensUsuario = usuarioConfigMapper.formatarPassagensUsuario(usuarioDto);


//    Optional<Usuario> usuarioById = escolhaPagamentoRepository.findUsuarioById(usuarioDto.getId());
    List<EscolhaPassagem> escolhaPassagems = new ArrayList<>();


  }
}

