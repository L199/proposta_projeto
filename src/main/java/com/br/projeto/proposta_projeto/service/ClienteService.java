package com.br.projeto.proposta_projeto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.projeto.proposta_projeto.dto.ClienteDTO;
import com.br.projeto.proposta_projeto.exception.NotFoundException;
import com.br.projeto.proposta_projeto.model.Cliente;

import com.br.projeto.proposta_projeto.repository.ClienteRepo;

import lombok.RequiredArgsConstructor;



@Service
//@RequiredArgsConstructor
public class ClienteService {


    //private final ClienteRepo repo;

   /* public Cliente getById(long id) {
        Optional<Cliente> clienteOptional = repo.findById(id);
        if (clienteOptional.isEmpty()) {
            throw new NotFoundException("Veiculo não encontrado");
        }
        Cliente clienteEncontrado = clienteOptional.get();
        return clienteEncontrado;
    }
    public List<ClienteDTO> getAll() {
        // o método finAll retorna um Iterable, e nós precisamos de um List
        // por isso fazemos um Casting, transformando para o tipo que precisamos
        List<Cliente> lista = (List<Cliente>) repo.findAll();
        List<ClienteDTO> listaDTO = new ArrayList<>();
        for (Cliente cliente : lista) {
            listaDTO.add(new ClienteDTO(cliente));
        }
        return listaDTO;
    }*/
    @Autowired
    private ClienteRepo repo;

    public Cliente cadastrarCliente(Cliente c) {
        return repo.save(c);
    }

    public List<Cliente> recuperarTodos() {
        return (List<Cliente>) repo.findAll();
    }

    public Cliente recuperarPeloID(Long id) {
        Optional<Cliente> clienteOptional = repo.findById(id);
        if(clienteOptional.isPresent()) {
            return clienteOptional.get();
        } else {
            throw new NotFoundException("Cliente não encontrado");
        }
    }
    
    }
    
    



    
    
    

    
    
    

    
    
    

    
    
    


