package com.sptech.school.bilhete.repository;

import com.sptech.school.bilhete.domain.Bilhete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BilheteRepository extends JpaRepository<Bilhete, Integer> {

}
