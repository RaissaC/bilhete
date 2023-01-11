package com.sptech.school.bilhete.service;

import com.sptech.school.bilhete.domain.MeioPagamento;
import com.sptech.school.bilhete.domain.Passagem;
import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.mapper.UsuarioMapper;
import com.sptech.school.bilhete.repository.MeioPagamentoRepository;
import com.sptech.school.bilhete.repository.PassagemRepository;
import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioCriacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceCreate {

  @Autowired
  private UsuarioMapper usuarioMapper;

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private PassagemRepository passagemRepository;

  @Autowired
  private MeioPagamentoRepository meioPagamentoRepository;


  public void criarUsuario(UsuarioCriacaoDto usuarioCriacaoDto) {

    List<String> passagensEscolhidas = Arrays.stream(usuarioCriacaoDto.getEscolhaPassagens().split(",")).collect(Collectors.toList());
    List<Passagem> byTipoIn = passagemRepository.findByTipoIn(passagensEscolhidas);

    List<MeioPagamento> pagamentos = new ArrayList<>();
    Usuario usuario = usuarioMapper.toDomain(usuarioCriacaoDto);

    usuarioRepository.save(usuario);

    for (Passagem passagem : byTipoIn) {
      MeioPagamento meioPagamento = new MeioPagamento();

      meioPagamento.setUsuario(usuario);
      meioPagamento.setPassagem(passagem);
      pagamentos.add(meioPagamento);
    }

    meioPagamentoRepository.saveAll(pagamentos);
  }
}