package com.br.projeto.proposta_projeto.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.projeto.proposta_projeto.model.Movimentacao;
import java.util.List;

public interface MovimentacaoRepo extends CrudRepository <Movimentacao, Long> {
    List<Movimentacao> findByConta_NumeroConta(Long numeroConta);
}
