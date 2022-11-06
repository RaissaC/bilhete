package com.sptech.school.bilhete.mapper;

import com.sptech.school.bilhete.domain.Usuario;
import com.sptech.school.bilhete.service.dto.UsuarioCriacaoDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    Usuario toDomain(UsuarioCriacaoDto usuarioCriacaoDto);

}
