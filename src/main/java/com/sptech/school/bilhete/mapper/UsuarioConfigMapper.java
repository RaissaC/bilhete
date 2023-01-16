package com.sptech.school.bilhete.mapper;

import com.sptech.school.bilhete.domain.MeioPagamento;
import com.sptech.school.bilhete.domain.Passagem;
import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.repository.MeioPagamentoRepository;
import com.sptech.school.bilhete.repository.PassagemRepository;
import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioCriacaoDto;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioConfigMapper {

  @Autowired
  private PassagemRepository passagemRepository;

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private MeioPagamentoRepository meioPagamentoRepository;

  @Autowired
  private UsuarioMapper usuarioMapper;

  public void mapearEscolhasUsuario(@NotNull UsuarioCriacaoDto usuarioCriacaoDto) {
    List<String> passagensEscolhidas = Arrays.stream(usuarioCriacaoDto.getEscolhaPassagens().split(",")).collect(Collectors.toList());
    List<Passagem> tipoVerificado = passagemRepository.findByTipoIn(passagensEscolhidas);
    List<MeioPagamento> pagamentos = new ArrayList<>();

    Usuario usuarioSalvo = usuarioRepository.save(usuarioMapper.toDomain(usuarioCriacaoDto));

    for (Passagem passagemVerificada : tipoVerificado) {
      MeioPagamento meioPagamento = new MeioPagamento();
      meioPagamento.setUsuario(usuarioSalvo);
      meioPagamento.setPassagem(passagemVerificada);
      pagamentos.add(meioPagamento);
    }
    meioPagamentoRepository.saveAll(pagamentos);
    usuarioSalvo.setMeioPagamentos(pagamentos);
    usuarioRepository.save(usuarioSalvo);

  }
}
