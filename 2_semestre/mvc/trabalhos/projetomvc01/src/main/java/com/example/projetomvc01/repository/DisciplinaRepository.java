package com.example.projetomvc01.repository;

import com.example.projetomvc01.domain.Disciplina;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class DisciplinaRepository {
    private final List<Disciplina> disciplinas = new ArrayList<>();

    public List<Disciplina> findAll() {
        return new ArrayList<>(disciplinas);
    }

    public Optional<Disciplina> findById(Long id) {
        return disciplinas.stream().filter(disciplina -> disciplina.getId().equals(id)).findFirst();
    }

    public Disciplina save(Disciplina disciplina) {
        disciplinas.removeIf(d -> d.getId().equals(disciplina.getId()));
        disciplinas.add(disciplina);
        return disciplina;
    }

    public void deleteById(Long id) {
        disciplinas.removeIf(disciplina -> disciplina.getId().equals(id));
    }
}