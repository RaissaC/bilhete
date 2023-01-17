package com.sptech.school.bilhete.service;

import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.repository.EscolhaPagamentoRepository;
import com.sptech.school.bilhete.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceDelete {

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private EscolhaPagamentoRepository escolhaPagamentoRepository;

  public void excluir(Integer idUsuario) {

    Optional<Usuario> usuarioById = escolhaPagamentoRepository.findUsuarioById(idUsuario);

  // ENQUANTO HOUVER ESCOLHAS DE PASSAGENS DAQUELE USUÁRIO, EXCLUA AS ESCOLHAS FEITAS

    escolhaPagamentoRepository.deleteById(usuarioById.get().getId());
    usuarioRepository.deleteById(idUsuario);
  }
}
