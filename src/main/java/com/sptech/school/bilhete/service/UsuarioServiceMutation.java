package com.sptech.school.bilhete.service;

import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.mapper.UsuarioMapper;
import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioAtualizacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceMutation {

  @Autowired
  private UsuarioMapper usuarioMapper;

  @Autowired
  private UsuarioRepository usuarioRepository;

  public void atualizarUsuario(UsuarioAtualizacaoDto usuarioAtualizacao) {
    Usuario usuario = usuarioMapper.toDomain(usuarioAtualizacao);
    Optional<Usuario> usuarioRepository = this.usuarioRepository.findById(usuario.getId());
    usuarioRepository.ifPresent(u -> {
      u.setNome(usuarioAtualizacao.getNome());
      u.setDataNascimento(usuarioAtualizacao.getDataNascimento());
      u.setCpf(usuarioAtualizacao.getCpf());
      u.setTiposPassagens(usuarioAtualizacao.getTiposPassagens());
    });

    this.usuarioRepository.save(usuario);
  }

}
