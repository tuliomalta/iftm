package com.example.projetomvc01.controller;

import com.example.projetomvc01.domain.Disciplina;
import com.example.projetomvc01.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/disciplina")
public class DisciplinaController {

    private final DisciplinaRepository disciplinaRepository;

    @Autowired
    public DisciplinaController(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    @GetMapping("/list")
    public String listDisciplinas(Model model) {
        List<Disciplina> disciplinas = disciplinaRepository.findAll();
        model.addAttribute("disciplinas", disciplinas);
        return "disciplina/list";
    }

    @GetMapping("/{id}")
    public String getDisciplinaById(@PathVariable Long id, Model model) {
        Optional<Disciplina> disciplina = disciplinaRepository.findById(id);
        model.addAttribute("disciplina", disciplina.orElse(null));
        return "disciplina/view";
    }

    @GetMapping("/add")
    public String addDisciplinaForm(Model model) {
        model.addAttribute("disciplina", new Disciplina());
        return "disciplina/add";
    }

    @PostMapping("/add")
    public String addDisciplina(@ModelAttribute Disciplina disciplina) {
        disciplinaRepository.save(disciplina);
        return "redirect:/disciplina/list";
    }

    @GetMapping("/edit/{id}")
    public String editDisciplinaForm(@PathVariable Long id, Model model) {
        Optional<Disciplina> disciplina = disciplinaRepository.findById(id);
        model.addAttribute("disciplina", disciplina.orElse(null));
        return "disciplina/edit";
    }

    @PostMapping("/edit/{id}")
    public String updateDisciplina(@PathVariable Long id, @ModelAttribute Disciplina disciplinaDetails) {
        Disciplina disciplina = disciplinaRepository.findById(id).orElseThrow();
        disciplina.setNomeDisciplina(disciplinaDetails.getNomeDisciplina());
        disciplina.setSiglaDisciplina(disciplinaDetails.getSiglaDisciplina());
        disciplina.setCargaHoraria(disciplinaDetails.getCargaHoraria());
        disciplina.setCurso(disciplinaDetails.getCurso());
        disciplina.setAluno(disciplinaDetails.getAluno());
        disciplinaRepository.save(disciplina);
        return "redirect:/disciplina/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteDisciplina(@PathVariable Long id) {
        disciplinaRepository.deleteById(id);
        return "redirect:/disciplina/list";
    }
}