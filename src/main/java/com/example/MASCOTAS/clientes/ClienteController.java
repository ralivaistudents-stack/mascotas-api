package com.example.MASCOTAS.clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public Iterable<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

}