package org.example.solid;

class Colaborador {
    private String nome;
    private String cargo;

    public Colaborador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
}

