package me.dio.controller.dto;

import lombok.Data;

import java.util.List;
@Data
public class PedidoDto {
    private Long id;
    private Long clienteId;
    private List<Long> pratoIds;
    private Double total;
    // outros campos e getters e setters
}
