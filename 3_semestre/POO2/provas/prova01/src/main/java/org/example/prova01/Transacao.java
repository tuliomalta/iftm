package org.example.prova01;

public abstract class Transacao implements Operacao {
    protected Produto produto;
    protected int quantidade;

    public Transacao(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
