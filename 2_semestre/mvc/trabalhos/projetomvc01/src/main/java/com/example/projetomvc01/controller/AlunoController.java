package com.example.projetomvc01.controller;

import com.example.projetomvc01.domain.Aluno;
import com.example.projetomvc01.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoRepository alunoRepository;

    @Autowired
    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping("/list")
    public String listAlunos(Model model) {
        List<Aluno> alunos = alunoRepository.findAll();
        model.addAttribute("alunos", alunos);
        return "aluno/list";
    }

    @GetMapping("/{id}")
    public String getAlunoById(@PathVariable Long id, Model model) {
        Optional<Aluno> aluno = alunoRepository.findById(id);
        model.addAttribute("aluno", aluno.orElse(null));
        return "aluno/view";
    }

    @GetMapping("/add")
    public String addAlunoForm(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "aluno/add";
    }

    @PostMapping("/add")
    public String addAluno(@ModelAttribute Aluno aluno) {
        alunoRepository.save(aluno);
        return "redirect:/aluno/list";
    }

    @GetMapping("/edit/{id}")
    public String editAlunoForm(@PathVariable Long id, Model model) {
        Optional<Aluno> aluno = alunoRepository.findById(id);
        model.addAttribute("aluno", aluno.orElse(null));
        return "aluno/edit";
    }

    @PostMapping("/edit/{id}")
    public String updateAluno(@PathVariable Long id, @ModelAttribute Aluno alunoDetails) {
        Aluno aluno = alunoRepository.findById(id).orElseThrow();
        aluno.setNome(alunoDetails.getNome());
        aluno.setCpf(alunoDetails.getCpf());
        aluno.setSexo(alunoDetails.getSexo());
        aluno.setCurso(alunoDetails.getCurso());
        aluno.setDisciplinas(alunoDetails.getDisciplinas());
        alunoRepository.save(aluno);
        return "redirect:/aluno/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteAluno(@PathVariable Long id) {
        alunoRepository.deleteById(id);
        return "redirect:/aluno/list";
    }
}