package me.dio.controller.dto;

import lombok.Data;

@Data
public class PratoDto {
    private Long id;
    private String nome;
    private Double preco;

    public Object getNome() {
        return null;
    }
    // outros campos e getters e setters
}
