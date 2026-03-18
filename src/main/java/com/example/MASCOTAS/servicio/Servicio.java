package com.example.MASCOTAS.servicio;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "servicio")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_servicio")
    private Long idServicio;

    @Column(name="descripcion", nullable=false)
    private String descripcion;

    @Column(name="precio", nullable=false)
    private Float precio;
}