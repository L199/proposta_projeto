package com.br.projeto.proposta_projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.projeto.proposta_projeto.model.Conta;
import com.br.projeto.proposta_projeto.service.ContaService;

@RestController
@RequestMapping("/contas")
public class ContaController {
    
    
    @Autowired
    private ContaService contaService;

    
    PostMapping
    public ResponseEntity<Conta> adicionarConta(@RequestBody Conta conta) {
        Conta novaConta = contaService.adicionarConta(conta);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaConta);
    }

    @GetMapping("/{numero}")
    public ResponseEntity<Conta> recuperarContaPorNumero(@PathVariable Integer numero) {
        Conta conta = contaService.recuperarPeloNumero(numero);
        if (conta != null) {
            return ResponseEntity.ok(conta);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{numero}")
    public ResponseEntity<Conta> alterarDadosDaConta(@PathVariable Integer numero, @RequestBody Conta conta) {
        Conta contaExistente = contaService.recuperarPeloNumero(numero);
        if (contaExistente != null) {
            contaExistente.setSaldo(conta.getSaldo());
            contaService.alterarDados(contaExistente);
            return ResponseEntity.ok(contaExistente);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/cliente/{idCliente}")
    public ResponseEntity<List<Conta>> recuperarContasPorCliente(@PathVariable Integer idCliente) {
        List<Conta> contas = contaService.recuperarContasPeloCliente(idCliente);
        return ResponseEntity.ok(contas);
    }
    
    s
    
}

    

