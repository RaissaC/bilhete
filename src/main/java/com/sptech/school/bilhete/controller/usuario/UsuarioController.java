package com.sptech.school.bilhete.controller.usuario;


import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.UsuarioServiceCreate;
import com.sptech.school.bilhete.service.UsuarioServiceDelete;
import com.sptech.school.bilhete.service.UsuarioServiceMutation;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioCriacaoDto;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioAtualizacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class UsuarioController {

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private UsuarioServiceCreate usuarioServiceCreate;

  @Autowired
  private UsuarioServiceMutation usuarioServiceMutation;

  @Autowired
  private UsuarioServiceDelete usuarioServiceDelete;

  @GetMapping("/usuarios")
  public String usuarios(Model model) {
    model.addAttribute("usuarios", usuarioRepository.findAll());
    return "usuarios";
  }

  @PostMapping("/cadastrar")
  public String cadastrarUsuario(@Valid UsuarioCriacaoDto usuarioCriacao, Model model) {
    usuarioServiceCreate.criarUsuario(usuarioCriacao);
    model.addAttribute("usuarios", usuarioRepository.findAll());
    return "usuarios";
  }

  @GetMapping("/edicao/{id}")
  public String edicao(@PathVariable("id") Integer id, Model model) {
    Optional<Usuario> usuarioRepository = this.usuarioRepository.findById(id);
    usuarioRepository.ifPresent(usuario -> model.addAttribute("usuarioAtualizacao", usuario));
    return "atualizacao";
  }

  @PostMapping("/editar/{id}")
  public String editarusuario(UsuarioAtualizacaoDto usuarioAtualizacao, Model model) {
    usuarioServiceMutation.atualizarUsuario(usuarioAtualizacao);
    model.addAttribute("usuarios", usuarioRepository.findAll());
    return "usuarios";
  }

  @GetMapping("/excluir/{id}")
  public String excluir(@PathVariable Integer id, Model model) {
    usuarioServiceDelete.excluir(id);
    model.addAttribute("usuarios", usuarioRepository.findAll());
    return "usuarios";
  }
}
