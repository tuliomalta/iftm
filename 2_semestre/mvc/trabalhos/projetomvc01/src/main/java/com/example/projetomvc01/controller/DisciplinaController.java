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

    @GetMapping("/crud")
    public String listDisciplinas(Model model) {
        List<Disciplina> disciplinas = disciplinaRepository.findAll();
        model.addAttribute("disciplinas", disciplinas);
        model.addAttribute("disciplina", new Disciplina());
        return "disciplina/crud";
    }

    @GetMapping("/edit/{id}")
    public String editDisciplinaForm(@PathVariable Long id, Model model) {
        Optional<Disciplina> disciplina = disciplinaRepository.findById(id);
        model.addAttribute("disciplina", disciplina.orElse(new Disciplina()));
        model.addAttribute("disciplinas", disciplinaRepository.findAll());
        return "disciplina/crud";
    }

    @PostMapping("/add")
    public String addDisciplina(@ModelAttribute Disciplina disciplina) {
        disciplinaRepository.save(disciplina);
        return "redirect:/disciplina/crud";
    }

    @PostMapping("/edit/{id}")
    public String updateDisciplina(@PathVariable Long id, @ModelAttribute Disciplina disciplinaDetails) {
        Disciplina disciplina = disciplinaRepository.findById(id).orElseThrow();
        disciplina.setNomeDisciplina(disciplinaDetails.getNomeDisciplina());
        disciplina.setSiglaDisciplina(disciplinaDetails.getSiglaDisciplina());
        disciplina.setCargaHoraria(disciplinaDetails.getCargaHoraria());
        disciplinaRepository.save(disciplina);
        return "redirect:/disciplina/crud";
    }

    @GetMapping("/delete/{id}")
    public String deleteDisciplina(@PathVariable Long id) {
        disciplinaRepository.deleteById(id);
        return "redirect:/disciplina/crud";
    }
}