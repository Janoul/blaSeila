package com.BookThePhone.demo.repository;

import com.BookThePhone.demo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    public Cliente findByNome(String nome);
}
