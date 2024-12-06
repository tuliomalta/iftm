// AlunoController.java
package com.example.projetomvc01.controller;

import com.example.projetomvc01.domain.Aluno;
import com.example.projetomvc01.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoRepository alunoRepository;

    @Autowired
    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping("/listar")
    public List<Aluno> getAllStudents() {
        return alunoRepository.findAll();
    }
}