// DisciplinaController.java
package com.example.projetomvc01.controller;

import com.example.projetomvc01.domain.Disciplina;
import com.example.projetomvc01.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    private final DisciplinaRepository disciplinaRepository;

    @Autowired
    public DisciplinaController(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    @GetMapping("/listar")
    public List<Disciplina> getAllDisciplinas() {
        return disciplinaRepository.findAll();
    }

    @PostMapping("/adicionar")
    public Disciplina addDisciplina(@RequestBody Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }
}