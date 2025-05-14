package org.example.prova01;

import java.util.ArrayList;
import java.util.List;

public class GerenciaEstoque {

    private static List<Produto> produtos = new ArrayList<>();

    private static List<String> transacoes = new ArrayList<>();

    public static void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public static Produto buscarProduto(String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public static String listarProdutos() {
        StringBuilder sb = new StringBuilder();
        for (Produto p : produtos) {
            sb.append(p.imprimirDetalhes()).append("\n");
        }
        return sb.toString();
    }

    public static void registrarTransacao(String msg) {
        transacoes.add(msg);
    }

    public static String listarTransacoes() {
        StringBuilder sb = new StringBuilder();
        for (String t : transacoes) {
            sb.append(t).append("\n");
        }
        return sb.toString();
    }
}
