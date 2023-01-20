package com.sptech.school.bilhete.repository;

import com.sptech.school.bilhete.domain.Passagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassagemRepository extends JpaRepository<Passagem, Integer> {

  List<Passagem> findByTipoIn(List<String> escolhaPassagens);


}
