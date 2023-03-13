package com.br.projeto.proposta_projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.projeto.proposta_projeto.model.Cliente;
import com.br.projeto.proposta_projeto.repository.ClienteRepo;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepo clienteRepo;

    public Cliente cadastrarCliente(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    public List<Cliente> recuperarTodos() {
        return clienteRepo.findAll();
    }

    public Cliente recuperarPeloId(Long id) {
        return clienteRepo.findById(id).orElseThrow(() -> new NotFoundException("Cliente não encontrado"));
    }

}
