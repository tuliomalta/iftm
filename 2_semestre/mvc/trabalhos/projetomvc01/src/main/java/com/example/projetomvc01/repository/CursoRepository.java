package com.example.projetomvc01.repository;

import com.example.projetomvc01.domain.Curso;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CursoRepository {
    private final List<Curso> cursos = new ArrayList<>();

    public List<Curso> findAll() {
        return new ArrayList<>(cursos);
    }

    public Optional<Curso> findById(Long id) {
        return cursos.stream().filter(curso -> curso.getId().equals(id)).findFirst();
    }

    public Curso save(Curso curso) {
        cursos.removeIf(c -> c.getId().equals(curso.getId()));
        cursos.add(curso);
        return curso;
    }

    public void deleteById(Long id) {
        cursos.removeIf(curso -> curso.getId().equals(id));
    }
}