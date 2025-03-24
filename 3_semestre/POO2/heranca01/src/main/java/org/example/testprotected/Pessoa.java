package org.example.testprotected;

public class Pessoa {

    private String nome;
    protected String cpf;
    public int anoNascimento;

    public Pessoa() {}

    public Pessoa(String nome, String cpf, int anoNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}
