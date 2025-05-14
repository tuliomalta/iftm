package org.example.prova01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nM E N U");
            System.out.println("1- ADICIONA PRODUTO");
            System.out.println("2- COMPRA");
            System.out.println("3- VENDA");
            System.out.println("4- EXIBE TRANSAÇÕES");
            System.out.println("5- SAIR");
            System.out.print("ESCOLHA UMA OPÇÃO: ");

            int op = sc.nextInt();
            sc.nextLine();

            try {
                switch (op) {
                    case 1:
                        menuCadastro(sc);
                        break;
                    case 2:
                        realizarOperacao(sc, true);
                        break;
                    case 3:
                        realizarOperacao(sc, false);
                        break;
                    case 4:
                        System.out.println("\nTRANSAÇÕES: ");
                        System.out.println(GerenciaEstoque.listarTransacoes());
                        break;
                    case 5:
                        sc.close();
                        return;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private static void menuCadastro(Scanner sc) {
        System.out.println("\nS U B   M E N U");
        System.out.println("1- PRODUTO FÍSICO");
        System.out.println("2- PRODUTO DIGITAL");
        System.out.println("3- VOLTAR");
        System.out.print("ESCOLHA UMA OPÇÃO: ");

        int sub = sc.nextInt();
        sc.nextLine();

        if (sub == 1) {
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Preço: ");
            double preco = sc.nextDouble();

            System.out.println("Quantidade: ");
            int qtd = sc.nextInt();
            sc.nextLine();

            if (GerenciaEstoque.buscarProduto(nome) != null) {
                System.out.println("Produto já existe");
            } else {
                GerenciaEstoque.adicionarProduto(new ProdutoFisico(nome, preco, qtd));
            }
        } else if (sub == 2) {
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Preço: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            if (GerenciaEstoque.buscarProduto(nome) != null) {
                System.out.println("Produto já existe");
            } else {
                GerenciaEstoque.adicionarProduto(new ProdutoDigital(nome, preco));
            }
        }
    }

    private static void realizarOperacao(Scanner sc, boolean isCompra) throws Exception {
        System.out.println("Nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Quantidade: ");

        int q = sc.nextInt();
        sc.nextLine();
        Produto p = GerenciaEstoque.buscarProduto(nome);

        if (p == null) {
            System.out.println("Produto não encontrado");
        } else {
            Operacao op = isCompra ? new Compra(p, q) : new Venda(p, q);
            System.out.println(op.executar());
        }
    }
}
