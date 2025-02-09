package com.example.lista06.lesson10;

public class Aluno {
    private String matricula;
    private String nome;
    private String cpf;

    public Aluno(String matricula, String nome, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Nome: " + nome + ", CPF: " + cpf;
    }
}