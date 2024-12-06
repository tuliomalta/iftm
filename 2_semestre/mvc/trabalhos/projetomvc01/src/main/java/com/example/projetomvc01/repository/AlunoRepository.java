package com.example.projetomvc01.repository;

import com.example.projetomvc01.domain.Aluno;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AlunoRepository {
    private final List<Aluno> alunos = new ArrayList<>();

    public List<Aluno> findAll() {
        return new ArrayList<>(alunos);
    }

    public Optional<Aluno> findById(Long id) {
        return alunos.stream().filter(aluno -> aluno.getId().equals(id)).findFirst();
    }

    public Aluno save(Aluno aluno) {
        alunos.removeIf(a -> a.getId().equals(aluno.getId()));
        alunos.add(aluno);
        return aluno;
    }

    public void deleteById(Long id) {
        alunos.removeIf(aluno -> aluno.getId().equals(id));
    }
}