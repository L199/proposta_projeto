package com.br.projeto.proposta_projeto.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.projeto.proposta_projeto.model.Movimentacao;
import com.br.projeto.proposta_projeto.repository.MovimentacaoRepo;

@Service
public class MovimentacaoService {
    

    @Autowired
    private MovimentacaoRepo movimentacaoRepository;

    // movimentacao/{id} (GET) - chama o serviço recuperarTodas
    public Movimentacao buscarMovimentacaoPorId(Long id) {
        return movimentacaoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Movimentação não encontrada"));
    }

    public Movimentacao cadastrarMovimentacao(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }
}
