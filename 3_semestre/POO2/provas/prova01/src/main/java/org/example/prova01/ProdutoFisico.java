package org.example.prova01;

public class ProdutoFisico extends Produto {
    public ProdutoFisico(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public void atualizarEstoque(int qtde) {
        this.quantidade += qtde;
    }
}