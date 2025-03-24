package org.example.heranca01;

import org.example.testprotected.Pessoa;

public class Professor extends Pessoa {

    private Double salario;
    private String disciplina;

    public Professor(String nome, String cpf, int anoNascimento,Double salario, String disciplina) {
        super(nome, cpf, anoNascimento);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
