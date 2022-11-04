package com.sptech.school.bilhete.repository;

import com.sptech.school.bilhete.service.dto.UsuarioCriacaoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioCriacaoDto, Integer> {
}
