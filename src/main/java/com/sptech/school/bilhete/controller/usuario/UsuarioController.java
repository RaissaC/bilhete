package com.sptech.school.bilhete.controller.usuario;


import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.repository.UsuarioRepository;
import com.sptech.school.bilhete.service.UsuarioServiceCreate;
import com.sptech.school.bilhete.service.dto.UsuarioCriacaoDto;
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

  @GetMapping("/usuarios")
  public String usuarios(Model model) {
    model.addAttribute("usuarios", usuarioRepository.findAll());
    return "usuarios";
  }

  @PostMapping("/cadastrar")
  public String cadastrarUsuario(@Valid UsuarioCriacaoDto usuarioCriacao, BindingResult result, RedirectAttributes redirectAttributes) {

    if (result.hasErrors()) {
      redirectAttributes.addFlashAttribute("falha", "Verifique os campos");

      return "cadastro";
    } else {
      usuarioServiceCreate.criarUsuario(usuarioCriacao);
      redirectAttributes.addFlashAttribute("sucesso", "Usuário cadastrado com sucesso");
      return "usuarios";

    }
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

  @GetMapping("/editar/{id}")
  public String editarusuario(@PathVariable("id") Integer id, Model model) {
    Optional<Usuario> usuarioRepository = this.usuarioRepository.findById(id);
    usuarioRepository.ifPresent(usuario -> model.addAttribute("usuario", usuario));
    return "atualizacao";
  }
}
