package com.example.MASCOTAS.mascotas;

import com.example.MASCOTAS.clientes.Cliente;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name="mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMascota;

    private Integer edad;

    private Boolean enPeligro;

    @Column(length = 100)
    private String nombre;

    @Column(length = 1)
    private String sexo;

    @Column(length = 50)
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

}