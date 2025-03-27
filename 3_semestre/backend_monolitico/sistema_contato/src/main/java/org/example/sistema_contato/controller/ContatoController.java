package org.example.sistema_contato.controller;

import org.example.sistema_contato.domain.Contato;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    @GetMapping
    public ResponseEntity<List<Contato>> listar() {
        List<Contato> contatos = Arrays.asList(new Contato(1, "Goku"),
        new Contato(2, "Vegeta"));
        return ResponseEntity.ok(contatos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contato> buscarPorId(@PathVariable Integer id) {
        List<Contato> contatos = Arrays.asList(new Contato(1, "Goku"),
                new Contato(2, "Vegeta"));

        for (Contato contato: contatos) {
            if (contato.getCodigo().equals(id)) {
                return ResponseEntity.ok(contato);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Contato>> buscarPorNome(@RequestParam(required = true) String nome) {
        List<Contato> contatos = Arrays.asList(new Contato(1, "Goku"),
                new Contato(2, "Vegeta"));
        List<Contato> resposta = new ArrayList<>();
        for (Contato contato: contatos) {
            if (contato.getNome().toLowerCase().contains(nome)) {
                resposta.add(contato);
            }
        }
        return ResponseEntity.ok(resposta);
    }

}
