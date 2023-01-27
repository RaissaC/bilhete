package com.sptech.school.bilhete.service;

import com.sptech.school.bilhete.mapper.UsuarioConfigMapper;
import com.sptech.school.bilhete.mapper.UsuarioMapper;
import com.sptech.school.bilhete.repository.EscolhaPassagemRepository;
import com.sptech.school.bilhete.repository.PassagemRepository;
import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioCriacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceCriacao {

  @Autowired
  private UsuarioMapper usuarioMapper;

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private PassagemRepository passagemRepository;

  @Autowired
  private EscolhaPassagemRepository escolhaPagamentoRepository;

  @Autowired
  private UsuarioConfigMapper usuarioConfigMapper;

  public void criarUsuario(UsuarioCriacaoDto usuarioCriacaoDto) {
    usuarioConfigMapper.cadastrarEscolhasUsuario(usuarioCriacaoDto);
  }
}