package com.sptech.school.bilhete.mapper;

import com.sptech.school.bilhete.domain.EscolhaPassagem;
import com.sptech.school.bilhete.domain.Passagem;
import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.domain.auxiliar.UsuarioAuxiliar;
import com.sptech.school.bilhete.repository.EscolhaPassagemRepository;
import com.sptech.school.bilhete.repository.PassagemRepository;
import com.sptech.school.bilhete.repository.UsuarioAuxiliarRepository;
import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioCriacaoDto;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioDto;
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
  private EscolhaPassagemRepository escolhaPagamentoRepository;

  @Autowired
  private UsuarioMapper usuarioMapper;
  @Autowired
  private UsuarioAuxiliarRepository usuarioAuxiliarRepository;

  public void cadastrarEscolhasUsuario(@NotNull UsuarioCriacaoDto usuarioCriacaoDto) {
    UsuarioAuxiliar usuarioAuxiliar = new UsuarioAuxiliar();
    Usuario usuarioSalvo = usuarioRepository.save(usuarioMapper.toDomain(usuarioCriacaoDto));
    List<EscolhaPassagem> escolhasPassagem = cadastrarEscolhasVerificadas(usuarioCriacaoDto, usuarioSalvo);

    usuarioSalvo.setEscolhasPassagens(escolhasPassagem);
    usuarioRepository.save(usuarioSalvo);

    List<Passagem> passagens = escolhasPassagem
        .stream()
        .map(item -> item.getPassagem())
        .collect(Collectors.toList());

    usuarioAuxiliar.setNome(usuarioSalvo.getNome());
    usuarioAuxiliar.setDataNascimento(usuarioSalvo.getDataNascimento());
    usuarioAuxiliar.setCpf(usuarioSalvo.getCpf());
    usuarioAuxiliar.setPassagens(passagens);
    usuarioAuxiliarRepository.save(usuarioAuxiliar);
  }

  public List<EscolhaPassagem> cadastrarEscolhasVerificadas(UsuarioCriacaoDto usuarioCriacaoDto, Usuario usuarioSalvo) {
    List<EscolhaPassagem> escolhasPassagem = new ArrayList<>();

    for (Passagem passagemVerificada : formatarPassagensUsuarioCriacao(usuarioCriacaoDto)) {
      EscolhaPassagem escolhaPassagem = new EscolhaPassagem();
      escolhaPassagem.setUsuario(usuarioSalvo);
      escolhaPassagem.setPassagem(passagemVerificada);
      escolhasPassagem.add(escolhaPassagem);
    }
    return escolhaPagamentoRepository.saveAll(escolhasPassagem);
  }

  public List<Passagem> formatarPassagensUsuarioCriacao(UsuarioCriacaoDto usuarioCriacaoDto) {
    List<String> passagensEscolhidas = Arrays.stream(usuarioCriacaoDto.getCheckedPassagens().split(",")).collect(Collectors.toList());
    return passagemRepository.findByTipoIn(passagensEscolhidas);
  }

  public List<Passagem> formatarPassagensUsuario(UsuarioDto usuarioDto) {
    List<String> passagensEscolhidas = Arrays.stream(usuarioDto.getEscolhaPassagens().split(",")).collect(Collectors.toList());
    return passagemRepository.findByTipoIn(passagensEscolhidas);
  }


}
