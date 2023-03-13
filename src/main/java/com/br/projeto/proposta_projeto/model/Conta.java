package com.br.projeto.proposta_projeto.model;

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
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroConta;

    @Column(nullable = false)
    private Integer agencia;
    @Column(nullable = false)
    private Integer tipoConta;
    @Column(nullable = false)
    private Double saldo;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;


    

    


    

    


    

    


    

    


    

    

    

   
   
    
    

}
