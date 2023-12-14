package com.BookThePhone.demo.DTO;

import com.BookThePhone.demo.model.Ebook;

public record EbookResponseDTO(Long id, String titulo, String autor, double preco) {
    public EbookResponseDTO(Ebook ebook){
        this(ebook.getId(), ebook.getTitulo(), ebook.getAutor(), ebook.getPreco());
    }
}