package com.sptech.school.bilhete.service;

import com.sptech.school.bilhete.mapper.UsuarioMapper;
import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioCriacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceCreate {

  @Autowired
  private UsuarioMapper usuarioMapper;

  @Autowired
  private UsuarioRepository usuarioRepository;

  public void criarUsuario(UsuarioCriacaoDto usuarioCriacaoDto) {
    usuarioRepository.save(usuarioMapper.toDomain(usuarioCriacaoDto));
  }
}