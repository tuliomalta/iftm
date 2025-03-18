package org.example.provafinal;

public class Animal {
    private String nome;
    private int idade;
    private String nomeTutor;
    private String registro;

    public Animal(String nome, int idade, String nomeTutor, String registro) {
        this.nome = nome;
        this.idade = idade;
        this.nomeTutor = nomeTutor;
        this.registro = registro;
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

    public String getNomeTutor() {
        return nomeTutor;
    }

    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nomeTutor='" + nomeTutor + '\'' +
                ", registro='" + registro + '\'' +
                '}';
    }
}