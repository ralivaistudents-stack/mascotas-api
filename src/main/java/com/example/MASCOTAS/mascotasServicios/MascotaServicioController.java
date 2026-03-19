package com.example.MASCOTAS.mascotasServicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mascotaServicio")
public class MascotaServicioController {

    @Autowired
    private MascotaServicioRepository mascotaServicioRepository;

    @GetMapping
    public Iterable<MascotaServicio> findAll(){
        return mascotaServicioRepository.findAll();
    }

    @PostMapping
    public MascotaServicio create(@RequestBody MascotaServicio ms){
        return mascotaServicioRepository.save(ms);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        mascotaServicioRepository.deleteById(id);
    }
}