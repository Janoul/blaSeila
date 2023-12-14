package com.BookThePhone.demo.controller;

import com.BookThePhone.demo.model.Cliente;
import com.BookThePhone.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {

        this.clienteService = clienteService;
    }


    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente){

        return clienteService.criarCliente(cliente);
    }

}
