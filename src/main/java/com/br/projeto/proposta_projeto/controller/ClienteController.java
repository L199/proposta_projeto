package com.br.projeto.proposta_projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.projeto.proposta_projeto.dto.ClienteDTO;
import com.br.projeto.proposta_projeto.model.Cliente;
import com.br.projeto.proposta_projeto.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    //-	/clientes (POST) - chama o serviço cadastrarCliente 
    //e pode retornar status 201 ou 400.
    @PostMapping //OK
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente c) {
        Cliente clienteCadastrado = service.cadastrarCliente(c);
        return new ResponseEntity<Cliente>(clienteCadastrado, HttpStatus.CREATED);
    }

    //-	/clientes (GET) - chama o serviço recuperarTodos
    @GetMapping //OK
    public ResponseEntity<List<Cliente>> recuperarTodos() {
        List<Cliente> clientes = service.recuperarTodos();
        return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
    }


    //-	/clientes/{id} (GET) - chama o serviço recuperarPeloId e 
    //pode retornar status 200 ou 404 se o cliente não existir
    @GetMapping("/{id}") //OK
    public ResponseEntity<Cliente> recuperarPeloID(@PathVariable Long id) {
        Cliente cliente = service.recuperarPeloID(id);
        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }
}











