package com.sptech.school.bilhete.controller.usuario;


import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.UsuarioServiceCreate;
import com.sptech.school.bilhete.service.UsuarioServiceMutation;
import com.sptech.school.bilhete.service.dto.UsuarioCriacaoDto;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioAtualizacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

  //  @GetMapping("/login")
//  public void getLogin(@Valid @RequestBody UsuarioCriacaoDto usuarioCriacaoDto, BindingResult result, Model model) {
//
//    Usuario usuarioDomain = usuarioMapper.toDomain(usuarioCriacaoDto);
//
//    if (result.hasErrors()) {
//
//    }
//    usuarioRepository.save(usuarioDomain);
//    model.addAttribute("users", usuarioRepository.findAll());
//  }/

  @GetMapping("/edicao/{id}")
  public String edicao(@PathVariable("id") Integer id, Model model) {
    Optional<Usuario> usuarioRepository = this.usuarioRepository.findById(id);
    usuarioRepository.ifPresent(usuario -> model.addAttribute("usuarioAtualizacao", usuario));
    return "atualizacao";
  }

  @GetMapping("/editar/{id}")
  public String editarusuario(UsuarioAtualizacaoDto usuarioAtualizacao, Model model) {
    usuarioServiceMutation.atualizarUsuario(usuarioAtualizacao);
    model.addAttribute("usuarioAtualizacao", usuarioAtualizacao);
    return "atualizacao";
  }

}
