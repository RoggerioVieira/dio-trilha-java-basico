package me.dio.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double preco;

    // Ajuste para um prato pertencer a um menu
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
}
