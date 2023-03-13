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

    public Conta recuperarPeloNumero(Long numeroConta) {
        return contaRepo.findByNumeroConta(numeroConta).orElseThrow(() -> new NotFoundException("Conta não encontrada"));
    }

    public List<Conta> recuperarContasPeloCliente(Long idCliente) {
        return contaRepo.findByCliente_IdCliente(idCliente);
    }

    public void alterarDados(Conta conta) {
        contaRepo.save(conta);
    }

}
