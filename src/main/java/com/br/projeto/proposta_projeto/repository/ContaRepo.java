package com.br.projeto.proposta_projeto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.br.projeto.proposta_projeto.model.Conta;

public interface ContaRepo extends CrudRepository<Conta, Long> {
    Optional<Conta> findByNumeroConta(Long numeroConta);
    List<Conta> findByCliente_IdCliente(Long idCliente);
}
