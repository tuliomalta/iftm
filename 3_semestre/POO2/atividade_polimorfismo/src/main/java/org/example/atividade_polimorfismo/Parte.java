package org.example.atividade_polimorfismo;

public abstract class Parte {
    int cod;
    String nome;
    String descricao;
    float valor;

    public Parte(int cod, String nome, String descricao, float valor) {
        this.cod = cod;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public abstract float calculaValor();

    @Override
    public abstract String toString();

}

