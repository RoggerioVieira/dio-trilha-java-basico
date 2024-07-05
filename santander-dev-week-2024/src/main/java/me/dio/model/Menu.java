
package me.dio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "restaurante_id")
    private Restaurante restaurante;

    // Ajuste para um menu pertencer a um restaurante
    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<Prato> pratos;

    public void toString(Object restaurante) {
    }

    public void setRestaurante(Object restaurante) {
        this.restaurante = (Restaurante) restaurante;
    }

    public Object getRestaurante() {
        return restaurante;
    }
}