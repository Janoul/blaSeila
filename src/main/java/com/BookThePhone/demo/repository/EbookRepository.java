package com.BookThePhone.demo.repository;

import com.BookThePhone.demo.model.Ebook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EbookRepository extends JpaRepository<Ebook, Long> {

    public Ebook findByTitulo(String titulo);
}
