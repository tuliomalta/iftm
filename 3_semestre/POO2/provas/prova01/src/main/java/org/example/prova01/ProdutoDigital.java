package org.example.prova01;

public class ProdutoDigital extends Produto {
    public ProdutoDigital(String nome, double preco) {
        super(nome, preco, Integer.MAX_VALUE);
    }

    @Override
    public void atualizarEstoque(int qtde) {
    }
}
