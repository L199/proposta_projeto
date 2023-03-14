package com.br.projeto.proposta_projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.projeto.proposta_projeto.exception.NotFoundException;
import com.br.projeto.proposta_projeto.model.Conta;
import com.br.projeto.proposta_projeto.model.Conta;
import com.br.projeto.proposta_projeto.repository.ClienteRepo;
import com.br.projeto.proposta_projeto.repository.ContaRepo;

@Service
public class ContaService {

    @Autowired
    private ContaRepo contaRepository;

    @Autowired
    private ClienteRepo clienteRepository;

   
    public Conta recuperarPeloNumero(Long numeroConta) {
        Optional <Conta> contaOptional= contaRepository.findById(numeroConta);
        if(contaOptional.isPresent()) {
            return contaOptional.get();
        } else {
            throw new NotFoundException("Cliente não encontrado");
        }
    
    }

    public List<Conta> recuperarTodosConta() {
        return (List<Conta>) contaRepository.findAll();
    }

    public Conta adicionarConta(Conta conta) {
        Conta contaInserido= contaRepository.save(conta);
        return contaInserido;
    }

    //////////////////////////////

    
    
    
    
    
    
    
    

    
   
    
    
    

    /*public Conta adicionarConta(Conta conta) {
        clienteRepository.findById(conta.getCliente().getId());
        
        contaRepository.save(conta);
    }*/

   


   /* public Conta adicionarConta(Conta conta) {
        return contaRepository.save(conta);
    }*/

    
    
    
    
    

    /*public Conta recuperarPeloNumero(Long numero_conta) {
        Optional<Conta> contaOptional = contaRepository.findById(numero_conta);
        if (contaOptional.isPresent()) {
            return contaOptional.get();
        } else {
            throw new NotFoundException("Conta não encontrado");
        }
    }*/



}
