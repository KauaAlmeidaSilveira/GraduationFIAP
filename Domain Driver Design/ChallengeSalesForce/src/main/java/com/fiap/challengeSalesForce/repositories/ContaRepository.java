package com.fiap.challengeSalesForce.repositories;

import com.fiap.challengeSalesForce.entities.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {
}