package org.example.prova01;

public abstract class Produto implements Imprimivel {

    protected String nome;

    protected double preco;

    protected int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public abstract void atualizarEstoque(int qtde) throws Exception;

    @Override
    public String imprimirDetalhes() {
        return "Produto: " + nome + ", Preço: " + preco + ", Quantidade: " + quantidade;
    }
}

