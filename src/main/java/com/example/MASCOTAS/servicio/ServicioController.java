package com.example.MASCOTAS.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/servicio")
@CrossOrigin(origins = "*") // 🔥 agregar esto
public class ServicioController {

    @Autowired
    private ServicioRepository servicioRepository;

    // ✅ GET
    @GetMapping
    public Iterable<Servicio> findAll(){
        return servicioRepository.findAll();
    }

    // ✅ POST
    @PostMapping
    public Servicio create(@RequestBody Servicio servicio){
        return servicioRepository.save(servicio);
    }

    // 🗑️ DELETE (AGREGAR ESTO)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        servicioRepository.deleteById(id);
    }
}