package com.sptech.school.bilhete.service;

import com.sptech.school.bilhete.domain.Passagem;
import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.mapper.UsuarioMapper;
import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioCriacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceCreate {

  @Autowired
  private UsuarioMapper usuarioMapper;

  @Autowired
  private UsuarioRepository usuarioRepository;

  public void criarUsuario(UsuarioCriacaoDto usuarioCriacaoDto) {

    usuarioRepository.save(usuarioMapper.toDomain(usuarioCriacaoDto));
  }


  public List<Passagem> passagensUsuario(List<String> tiposPassagem) {
    Passagem passagem = new Passagem();
    List<Passagem> passagemUsuario = new ArrayList<>();

    for (int i = 0; i < passagens.size(); i++) {
      for (int j = 0; j < tiposPassagem.size(); j++) {
        if (tiposPassagem.get(j).equals("Bilhete")) {
          passagem.setTipo("Bilhte");

        } else if (tiposPassagem.get(j).equals("Dinheiro")) {

        } else {
          return null;
        }
      }
    }

  }

}
