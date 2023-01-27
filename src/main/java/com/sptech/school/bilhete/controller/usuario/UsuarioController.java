package com.sptech.school.bilhete.controller.usuario;


import com.sptech.school.bilhete.Enum.EnumTipo;
import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.repository.UsuarioAuxiliarRepository;
import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.UsuarioServiceAtualizacao;
import com.sptech.school.bilhete.service.UsuarioServiceCriacao;
import com.sptech.school.bilhete.service.UsuarioServiceExclusao;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioCriacaoDto;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class UsuarioController {

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private UsuarioAuxiliarRepository usuarioAuxiliarRepository;

  @Autowired
  private UsuarioServiceCriacao usuarioServiceCriacao;

  @Autowired
  private UsuarioServiceAtualizacao usuarioServiceAtualizacao;

  @Autowired
  private UsuarioServiceExclusao usuarioServiceExclusao;


  @GetMapping("/usuarios")
  public String usuarios(Model model) {
    model.addAttribute("usuariosAuxiliares", usuarioAuxiliarRepository.findAll());
    return "usuarios";
  }

  @PostMapping("/cadastrar")
  public String cadastrarUsuario(@Valid UsuarioCriacaoDto usuarioCriacao, Model model) {
    usuarioServiceCriacao.criarUsuario(usuarioCriacao);
    model.addAttribute("usuariosAuxiliares", usuarioAuxiliarRepository.findAll());
    return "usuarios";
  }

  @GetMapping("/edicao/{id}")
  public String edicao(@PathVariable("id") Integer id, Model model) {
    Optional<Usuario> usuarioRepository = this.usuarioRepository.findById(id);
    usuarioRepository.ifPresent(usuario -> model.addAttribute("usuarioAtualizacao", usuario));
    List<EnumTipo> listaTiposPassagens = List.of(EnumTipo.values());
    model.addAttribute("tiposPassagens", listaTiposPassagens);
    return "atualizacao";
  }

  @PostMapping("/editar/{id}")
  public String editarusuario(UsuarioDto usuarioDto, Model model) {
    usuarioServiceAtualizacao.atualizarUsuario(usuarioDto);
    model.addAttribute("usuarios", usuarioRepository.findAll());
    return "usuarios";
  }

  @GetMapping("/excluirUsuario/{id}")
  public String excluirUsuario(@PathVariable UsuarioDto usuarioDto, Model model) {
    usuarioServiceExclusao.excluir(usuarioDto);
    model.addAttribute("usuarios", usuarioRepository.findAll());
    return "usuarios";
  }
}
