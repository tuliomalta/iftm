package org.example.prova01;

public class Compra extends Transacao {
    public Compra(Produto produto, int quantidade) {
        super(produto, quantidade);
    }

    @Override
    public String executar() throws Exception {
        produto.atualizarEstoque(quantidade);
        String msg = "Compra Realizada: " + quantidade + " X " + produto.getNome();
        GerenciaEstoque.registrarTransacao(msg);
        return msg;
    }
}
