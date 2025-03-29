package com.example.trabalhofinal;

import java.util.ArrayList;
import java.util.List;

class CarrinhoDeCompras {
    private Cliente cliente;
    private List<Produto> produtos;
    private List<Integer> quantidades;

    public CarrinhoDeCompras(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.quantidades = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.add(produto);
        quantidades.add(quantidade);
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < produtos.size(); i++) {
            total += produtos.get(i).getPreco() * quantidades.get(i);
        }
        return total;
    }

    public void finalizarCompra() throws Exception {
        for (int i = 0; i < produtos.size(); i++) {
            produtos.get(i).vender(quantidades.get(i));
        }
        System.out.println("Compra finalizada! Total: R$" + calcularTotal());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Integer> getQuantidades() {
        return quantidades;
    }
}