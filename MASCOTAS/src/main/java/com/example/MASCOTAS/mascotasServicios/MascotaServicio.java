package com.example.MASCOTAS.mascotasServicios;

import com.example.MASCOTAS.mascotas.Mascota;
import com.example.MASCOTAS.servicio.Servicio;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="mascota_servicio")
public class MascotaServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_mascota_servicio")
    private Long idMascotaServicio;

    @ManyToOne
    @JoinColumn(name="id_mascota")
    private Mascota mascota;

    @ManyToOne
    @JoinColumn(name="id_servicio")
    private Servicio servicio;

    @Column(name="fecha")
    private LocalDate fecha;

    @Column(name="nota")
    private String nota;
}