package org.example.atividade_polimorfismo;

public class Parafuso extends Parte {
    float comprimento;
    float diametro;

    public Parafuso(int cod, String nome, String descricao, float valor, float comprimento, float diametro) {
        super(cod, nome, descricao, valor);
        this.comprimento = comprimento;
        this.diametro = diametro;
    }

    @Override
    public float calculaValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("codigo:%d nome:%s descricao:%s valor:%.1f comprimento:%.1f diametro:%.1f",
                cod, nome, descricao, valor, comprimento, diametro);
    }
}

