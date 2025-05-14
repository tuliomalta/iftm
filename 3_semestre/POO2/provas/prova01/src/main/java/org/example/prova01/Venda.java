package org.example.prova01;

public class Venda extends Transacao {
    public Venda(Produto produto, int quantidade) {
        super(produto, quantidade);
    }

    @Override
    public String executar() throws Exception {
        if (produto.getQuantidade() < quantidade) {
            throw new Exception("Estoque insuficiente para venda");
        }
        produto.atualizarEstoque(-quantidade);
        String msg = "Venda Realizada: " + quantidade + " X " + produto.getNome();
        GerenciaEstoque.registrarTransacao(msg);
        return msg;
    }
}
