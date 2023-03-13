package com.br.projeto.proposta_projeto.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.projeto.proposta_projeto.model.Cliente;

public interface ClienteRepo extends CrudRepository<Cliente, Long> {
}
