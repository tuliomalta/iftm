package com.example.projetomvc01.domain;

import jakarta.persistence.*;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCurso;
    private String siglaCurso;
    private String tipoCurso;

    // Removendo a relação com Aluno e Disciplina

    public Curso(Long id, String nomeCurso, String siglaCurso, String tipoCurso) {
        this.id = id;
        this.nomeCurso = nomeCurso;
        this.siglaCurso = siglaCurso;
        this.tipoCurso = tipoCurso;
    }

    public Curso() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getSiglaCurso() {
        return siglaCurso;
    }

    public void setSiglaCurso(String siglaCurso) {
        this.siglaCurso = siglaCurso;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }
}