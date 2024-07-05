package me.dio.controller.dto;

import lombok.Data;


@Data
public class MenuDto {
    private Long id;
    private String restaurante;

    public Object getRestaurante() {
        return null;
    }
    // outros campos e getters e setters
}

