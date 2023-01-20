package com.sptech.school.bilhete.service;

import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.mapper.UsuarioMapper;
import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceAtualizacao {

  @Autowired
  private UsuarioMapper usuarioMapper;

  @Autowired
  private UsuarioRepository usuarioRepository;

  public void atualizarUsuario(UsuarioDto usuarioDto) {
    Usuario usuario = usuarioMapper.toDomain(usuarioDto);
    Optional<Usuario> usuarioRepository = this.usuarioRepository.findById(usuario.getId());
    usuarioRepository.ifPresent(u -> {
      u.setNome(usuarioDto.getNome());
      u.setDataNascimento(usuarioDto.getDataNascimento());
      u.setCpf(usuarioDto.getCpf());
//      u.setEscolhaPassagens(usuarioDto.getEscolhaPassagens());
    });

    this.usuarioRepository.save(usuario);
  }

}
