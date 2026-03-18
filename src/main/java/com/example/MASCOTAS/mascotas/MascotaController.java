package com.example.MASCOTAS.mascotas;

import com.example.MASCOTAS.clientes.Cliente;
import com.example.MASCOTAS.clientes.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/mascota")
public class MascotaController {

    @Autowired
    private MascotaRepository mascotaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public Iterable<Mascota> findAll(){
        return mascotaRepository.findAll();
    }

    @PostMapping
    public Mascota create(@RequestBody Mascota mascota){

        Long idCliente = mascota.getCliente().getIdCliente();

        Optional<Cliente> cliente = clienteRepository.findById(idCliente);

        if(cliente.isPresent()){
            mascota.setCliente(cliente.get());
        }

        return mascotaRepository.save(mascota);
    }
}