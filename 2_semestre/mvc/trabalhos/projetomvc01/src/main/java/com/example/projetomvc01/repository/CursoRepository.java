// CursoRepository.java
package com.example.projetomvc01.repository;

import com.example.projetomvc01.domain.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}