package com.BookThePhone.demo.repository;

import com.BookThePhone.demo.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {
}
