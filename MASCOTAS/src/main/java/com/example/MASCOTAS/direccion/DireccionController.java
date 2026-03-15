package com.example.MASCOTAS.direccion;

import com.example.MASCOTAS.clientes.Cliente;
import com.example.MASCOTAS.clientes.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/direccion")
public class DireccionController {

    @Autowired
    private DireccionRepository direccionRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public Iterable<Direccion> findAll() {
        return direccionRepository.findAll();
    }

    @PostMapping
    public Direccion create(@RequestBody Direccion direccion) {

        Long idCliente = direccion.getCliente().getIdCliente();

        Optional<Cliente> cliente = clienteRepository.findById(idCliente);

        if (cliente.isPresent()) {
            direccion.setCliente(cliente.get());
        }

        return direccionRepository.save(direccion);
    }
}