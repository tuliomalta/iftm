package com.example.ficha_pessoal;

public class FichaPessoal {
    private String nome;
    private int idade;

    public FichaPessoal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public FichaPessoal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
