package com.example.trabalhofinal;

class Cliente {
    private int id;
    private String nome;
    private String email;

    public Cliente() {}

    public Cliente(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }

    public void comprar(CarrinhoDeCompras carrinho, Produto produto, int quantidade) {
        carrinho.adicionarProduto(produto, quantidade);
    }
}
