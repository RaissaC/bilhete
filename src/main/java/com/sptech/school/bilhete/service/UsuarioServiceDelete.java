package com.sptech.school.bilhete.service;

import com.sptech.school.bilhete.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceDelete {

  @Autowired
  private UsuarioRepository usuarioRepository;

  public void excluir(Integer id) {
    usuarioRepository.deleteById(id);
  }
}
