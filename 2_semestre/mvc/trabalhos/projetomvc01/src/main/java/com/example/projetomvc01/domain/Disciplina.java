package com.example.projetomvc01.domain;

import jakarta.persistence.*;

@Entity
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDisciplina;
    private String siglaDisciplina;
    private String cargaHoraria;

    // Removendo a relação com Curso e Aluno

    public Disciplina(Long id, String nomeDisciplina, String siglaDisciplina, String cargaHoraria) {
        this.id = id;
        this.nomeDisciplina = nomeDisciplina;
        this.siglaDisciplina = siglaDisciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public Disciplina() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getSiglaDisciplina() {
        return siglaDisciplina;
    }

    public void setSiglaDisciplina(String siglaDisciplina) {
        this.siglaDisciplina = siglaDisciplina;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}