package com.sptech.school.bilhete.repository;

import com.sptech.school.bilhete.domain.UsuarioAuxiliar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioAuxiliarRepository extends JpaRepository<UsuarioAuxiliar, Integer> {
}
