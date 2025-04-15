package org.example.atividade_polimorfismo;

public class Item {
    Parte parte;
    int quantidade;

    public Item(Parte parte, int quantidade) {
        this.parte = parte;
        this.quantidade = quantidade;
    }

    public float calculaValor() {
        return parte.calculaValor() * quantidade;
    }

    @Override
    public String toString() {
        return String.format("cod:%d nome:%s quantidade:%d valor unitario:%.1f valor:%.1f",
                parte.cod, parte.nome, quantidade, parte.valor, calculaValor());
    }
}

