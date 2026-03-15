package com.example.MASCOTAS.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/servicio")
public class ServicioController {

    @Autowired
    private ServicioRepository servicioRepository;

    @GetMapping
    public Iterable<Servicio> findAll(){
        return servicioRepository.findAll();
    }

    @PostMapping
    public Servicio create(@RequestBody Servicio servicio){
        return servicioRepository.save(servicio);
    }
}