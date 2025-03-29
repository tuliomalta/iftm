package com.example.trabalhofinal;

class Produto {
    private int id;
    private String nome;
    private double preco;
    private int estoque;

    public Produto() {
    }

    public Produto(int id, String nome, double preco, int estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void vender(int quantidade) throws Exception {
        if (quantidade > estoque) {
            throw new Exception("Estoque insuficiente!");
        }
        estoque -= quantidade;
    }
}