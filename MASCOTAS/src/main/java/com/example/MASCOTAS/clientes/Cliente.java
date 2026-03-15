package com.example.MASCOTAS.clientes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String apPaterno;

    @Column(nullable = false, length = 50)
    private String apMaterno;

    @Column(nullable = false, length = 50)
    private String email;

    // Getter necesario para evitar el error del controlador
    public Long getIdCliente() {
        return idCliente;
    }

}