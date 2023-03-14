package com.br.projeto.proposta_projeto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.br.projeto.proposta_projeto.model.Cliente;
import com.br.projeto.proposta_projeto.model.Conta;

public interface ContaRepo extends CrudRepository<Conta,Long> {
    List<Conta> findByCliente(Optional<Cliente> cliente);

}
