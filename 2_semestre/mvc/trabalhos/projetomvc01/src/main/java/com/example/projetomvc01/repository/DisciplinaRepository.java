// DisciplinaRepository.java
package com.example.projetomvc01.repository;

import com.example.projetomvc01.domain.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}