package com.sptech.school.bilhete.repository;

import com.sptech.school.bilhete.domain.MeioPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeioPagamentoRepository extends JpaRepository<MeioPagamento, Integer> {
}
