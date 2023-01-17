package com.sptech.school.bilhete.repository;

import com.sptech.school.bilhete.domain.EscolhaPagamento;
import com.sptech.school.bilhete.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EscolhaPagamentoRepository extends JpaRepository<EscolhaPagamento, Integer> {

  @Query("SELECT mp FROM EscolhaPagamento mp " +
      "JOIN Usuario us " +
      "ON mp.usuario = us.id")
  Optional<Usuario> findUsuarioById(Integer id);
}
