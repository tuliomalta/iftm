package com.example.projetomvc01.controller;

import com.example.projetomvc01.domain.Curso;
import com.example.projetomvc01.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/curso")
public class CursoController {

    private final CursoRepository cursoRepository;

    @Autowired
    public CursoController(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @GetMapping("/crud")
    public String listCursos(Model model) {
        List<Curso> cursos = cursoRepository.findAll();
        model.addAttribute("cursos", cursos);
        model.addAttribute("curso", new Curso());
        return "curso/crud";
    }

    @GetMapping("/edit/{id}")
    public String editCursoForm(@PathVariable Long id, Model model) {
        Optional<Curso> curso = cursoRepository.findById(id);
        model.addAttribute("curso", curso.orElse(new Curso()));
        model.addAttribute("cursos", cursoRepository.findAll());
        return "curso/crud";
    }

    @PostMapping("/add")
    public String addCurso(@ModelAttribute Curso curso) {
        cursoRepository.save(curso);
        return "redirect:/curso/crud";
    }

    @PostMapping("/edit/{id}")
    public String updateCurso(@PathVariable Long id, @ModelAttribute Curso cursoDetails) {
        Curso curso = cursoRepository.findById(id).orElseThrow();
        curso.setNomeCurso(cursoDetails.getNomeCurso());
        curso.setSiglaCurso(cursoDetails.getSiglaCurso());
        curso.setTipoCurso(cursoDetails.getTipoCurso());
        cursoRepository.save(curso);
        return "redirect:/curso/crud";
    }

    @GetMapping("/delete/{id}")
    public String deleteCurso(@PathVariable Long id) {
        cursoRepository.deleteById(id);
        return "redirect:/curso/crud";
    }
}