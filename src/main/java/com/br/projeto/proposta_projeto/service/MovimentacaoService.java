package com.br.projeto.proposta_projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.projeto.proposta_projeto.model.Movimentacao;
import com.br.projeto.proposta_projeto.repository.MovimentacaoRepo;

@Service
public class MovimentacaoService {

    @Autowired
    private MovimentacaoRepo movimentacaoRepo;

    public Movimentacao cadastrarMovimentacao(Movimentacao movimentacao) {
        return movimentacaoRepo.save(movimentacao);
    }

    public List<Movimentacao> recuperarTodas(Long numeroConta) {
        return movimentacaoRepo.findByContaNumeroConta(numeroConta);
    }
    
    

}














