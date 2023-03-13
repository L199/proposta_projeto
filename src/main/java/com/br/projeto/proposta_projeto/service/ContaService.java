package com.br.projeto.proposta_projeto.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.projeto.proposta_projeto.model.Conta;
import com.br.projeto.proposta_projeto.repository.ContaRepo;




@Service
public class ContaService {

    @Autowired
    private ContaRepo contaRepo;

    
    public Conta adicionarConta(Conta conta) {
        return contaRepo.save(conta);
    }

    public Conta recuperarPeloNumero(Long numero) {
        return contaRepo.findById(numero).orElse(null);
    }

    public Conta alterarDados(Conta conta) {
        return contaRepo.save(conta);
    }

    public List<Conta> recuperarContasPeloCliente(Long id) {
        return contaRepo.findByClienteIdCliente(id);
    }
   

}
