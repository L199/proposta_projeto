package com.br.projeto.proposta_projeto.model;

import java.util.Date;

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
public class Movimentacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSeq;
    private Date dataOperacao;
    private Double valor;
    private Integer tipoOperacao;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "numero_conta")
    private Conta conta;
}
