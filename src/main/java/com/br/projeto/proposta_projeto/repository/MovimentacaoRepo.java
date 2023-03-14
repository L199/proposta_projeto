package com.br.projeto.proposta_projeto.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.projeto.proposta_projeto.model.Movimentacao;

public interface MovimentacaoRepo extends CrudRepository <Movimentacao, Long> {
    
}
