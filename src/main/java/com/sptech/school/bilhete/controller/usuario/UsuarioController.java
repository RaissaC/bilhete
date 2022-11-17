package com.sptech.school.bilhete.controller.usuario;


import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.UsuarioServiceCreate;
import com.sptech.school.bilhete.service.dto.UsuarioCriacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class UsuarioController {

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private UsuarioServiceCreate usuarioServiceCreate;

  @GetMapping("/usuarios")
  public String usuarios(Model model) {
    model.addAttribute("usuarios", usuarioRepository.findAll());
    return "usuarios";
  }

  @PostMapping("/cadastrar")
  public String cadastrarUsuario(UsuarioCriacaoDto usuarioCriacaoDto) {
    usuarioServiceCreate.criarUsuario(usuarioCriacaoDto);
    return "usuarios";

  }

  @GetMapping("/editar/{id}")
  public String editarusuario(@PathVariable("id") Integer id, Model model) {
    Optional<Usuario> usuarioRepository = this.usuarioRepository.findById(id);
    usuarioRepository.ifPresent(usuario -> model.addAttribute("usuario", usuario));
    return "atualizacao";
  }
}
