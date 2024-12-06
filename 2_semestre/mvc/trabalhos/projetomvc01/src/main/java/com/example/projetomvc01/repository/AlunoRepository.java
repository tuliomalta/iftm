// AlunoRepository.java
package com.example.projetomvc01.repository;

import com.example.projetomvc01.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}