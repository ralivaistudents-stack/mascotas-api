package com.example.MASCOTAS.direccion;

import com.example.MASCOTAS.clientes.Cliente;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name="direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDireccion;

    @Column(nullable = false, length = 100)
    private String calle;

    @Column(nullable = false, length = 20)
    private String numero;

    @OneToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}