package com.sptech.school.bilhete.repository;

import com.sptech.school.bilhete.domain.EscolhaPassagem;
import com.sptech.school.bilhete.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EscolhaPassagemRepository extends JpaRepository<EscolhaPassagem, Integer> {

  @Query("SELECT mp FROM EscolhaPassagem mp " +
      "JOIN Usuario us " +
      "ON mp.usuario = us.id")
  Optional<Usuario> findUsuarioById(Integer id);

  @Query("select e from EscolhaPassagem e where e.usuario.id = ?1")
  List<EscolhaPassagem> findByUsuario_Id(Integer id);


}
