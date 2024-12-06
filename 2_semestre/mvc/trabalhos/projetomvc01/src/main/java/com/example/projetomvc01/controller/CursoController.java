// CursoController.java
package com.example.projetomvc01.controller;

import com.example.projetomvc01.domain.Curso;
import com.example.projetomvc01.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    private final CursoRepository cursoRepository;

    @Autowired
    public CursoController(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @GetMapping("/listar")
    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    @PostMapping("/adicionar")
    public Curso addCurso(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }
}