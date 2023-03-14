package com.br.projeto.proposta_projeto.controller;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.projeto.proposta_projeto.model.Conta;
import com.br.projeto.proposta_projeto.service.ContaService;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    private ContaService contaService;

    // - /contas/{id} (GET)- chama o serviço recuperarPeloNumero,
    // podendo retornar 200 ou 404s
    @GetMapping("/{numeroConta}")
    public Conta recuperarPeloNumero(@PathVariable Long numeroConta) {
        return contaService.recuperarPeloNumero(numeroConta);
    }

    @GetMapping
    public ResponseEntity<List<Conta>> recuperarTodosConta() {
        List<Conta> contas = contaService.recuperarTodosConta();
        return new ResponseEntity<List<Conta>>(contas, HttpStatus.OK);
    }

   // @PostMapping
    //@ResponseStatus(HttpStatus.CREATED)
    //public Conta adicionarConta(@RequestBody Conta conta) {
      //  contaService.adicionarConta(conta);
    //}

    // - /contas/{id} (GET)- chama o serviço recuperarPeloNumero,
    // podendo retornar 200 ou 404sss
    /*
     * @GetMapping("/{numero_conta}")
     * public ResponseEntity<Conta> recuperarPeloNumero(@PathVariable Long
     * numero_conta) {
     * Conta conta = contaService.recuperarPeloNumero(numero_conta);
     * return new ResponseEntity<Conta>(conta, HttpStatus.OK);
     * }
     */

    /*
     * @PostMapping
     * public ResponseEntity<Conta> adicionarConta(@RequestBody Conta conta) {
     * Conta contaAdicionada = contaService.adicionarConta(conta);
     * return ResponseEntity.status(HttpStatus.CREATED).body(contaAdicionada);
     * }
     */

}
