package org.example.heranca01;

import org.example.testprotected.Pessoa;

public class Aluno extends Pessoa {

    private long matricula;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, int anoNascimento, long matricula) {
        super(nome, cpf, anoNascimento);
        this.matricula = matricula;
    }

    public long getMatricula() {
        return matricula;
    }
}
