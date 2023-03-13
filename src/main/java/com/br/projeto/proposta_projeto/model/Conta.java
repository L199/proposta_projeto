package com.br.projeto.proposta_projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroConta;
    private Integer agencia;
    private Integer tipoConta;
    private Double saldo;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
