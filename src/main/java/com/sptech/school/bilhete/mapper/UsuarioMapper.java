package com.sptech.school.bilhete.mapper;

import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioCriacaoDto;
import com.sptech.school.bilhete.service.dto.usuario.UsuarioDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

  Usuario toDomain(UsuarioCriacaoDto usuarioCriacaoDto);

  Usuario toDomain(UsuarioDto usuarioDto);
}
