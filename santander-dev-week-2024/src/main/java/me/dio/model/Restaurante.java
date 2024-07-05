package me.dio.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurante {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String nome;

 // Adicione a anotação @OneToMany para definir o relacionamento
 //@OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
 //private List<Prato> menu;
}