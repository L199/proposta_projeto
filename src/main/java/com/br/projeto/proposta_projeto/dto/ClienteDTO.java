package com.br.projeto.proposta_projeto.dto;


import com.br.projeto.proposta_projeto.model.Cliente;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClienteDTO {
    

    private String nome;
    private String cpf;
    private String telefone;
    
    public ClienteDTO(Cliente cliente) {
        this.nome = cliente.getNome();
        this.cpf = cliente.getCpf();
        this.telefone = cliente.getTelefone();
    }

    

    
}
