package com.br.projeto.proposta_projeto.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movimentacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num_se;
    @Column(nullable = false)
    private Date dataOperacao;
    @Column(nullable = false)
    private Double valor;
    @Column(nullable = false)
    private Integer tipo;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "numero_conta")
    private Conta conta;
    

    


    

    


    

    


    

    


    

    

    

    
    
    
}
