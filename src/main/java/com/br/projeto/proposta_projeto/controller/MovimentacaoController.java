package com.br.projeto.proposta_projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.projeto.proposta_projeto.model.Movimentacao;
import com.br.projeto.proposta_projeto.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
    
    @Autowired
    private MovimentacaoService movimentacaoService;

    ///movimentacao/{id} (GET) - chama o serviço recuperarTodas
    @GetMapping("/{id}")
    public ResponseEntity<Movimentacao> buscarMovimentacaoPorId(@PathVariable Long id) {
        Movimentacao movimentacao = movimentacaoService.buscarMovimentacaoPorId(id);
        return ResponseEntity.ok(movimentacao);
    }

    @PostMapping
    public ResponseEntity<Movimentacao> cadastrarMovimentacao(@RequestBody Movimentacao movimentacao) {
        Movimentacao novaMovimentacao = movimentacaoService.cadastrarMovimentacao(movimentacao);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaMovimentacao);
    }


}
