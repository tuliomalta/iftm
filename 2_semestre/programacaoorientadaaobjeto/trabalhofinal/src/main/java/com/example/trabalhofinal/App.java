package com.example.trabalhofinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static List<Produto> listaProdutos = new ArrayList<>();
    private static List<Cliente> listaClientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Cadastrar Cliente");
            System.out.println("3 - Realizar Compra");
            System.out.println("4 - Listar Produtos");
            System.out.println("5 - Listar Clientes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    cadastrarCliente();
                    break;
                case 3:
                    realizarCompra();
                    break;
                case 4:
                    listarProdutos();
                    break;
                case 5:
                    listarClientes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void cadastrarProduto() {
        System.out.println("\n=== CADASTRAR PRODUTO ===");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        System.out.print("Estoque: ");
        int estoque = scanner.nextInt();

        Produto produto = new Produto(id, nome, preco, estoque);
        listaProdutos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void cadastrarCliente() {
        System.out.println("\n=== CADASTRAR CLIENTE ===");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(id, nome, email);
        listaClientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void realizarCompra() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado!");
            return;
        }

        System.out.println("\n=== REALIZAR COMPRA ===");
        System.out.print("Digite o ID do cliente: ");
        int clienteId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String clienteNome = scanner.nextLine();
        System.out.print("Digite o email do cliente: ");
        String clienteEmail = scanner.nextLine();

        Cliente cliente = new Cliente(clienteId, clienteNome, clienteEmail);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(cliente);

        System.out.println("Produtos disponíveis:");
        for (Produto produto : listaProdutos) {
            System.out.printf("ID: %d | Nome: %s | Preço: %.2f | Estoque: %d%n",
                    produto.getId(), produto.getNome(), produto.getPreco(), produto.getEstoque());
        }

        char continuar;
        do {
            System.out.print("Digite o ID do produto que deseja comprar: ");
            int produtoId = scanner.nextInt();
            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            Produto produtoSelecionado = null;
            for (Produto produto : listaProdutos) {
                if (produto.getId() == produtoId) {
                    produtoSelecionado = produto;
                    break;
                }
            }

            if (produtoSelecionado == null) {
                System.out.println("Produto não encontrado!");
            } else {
                try {
                    cliente.comprar(carrinho, produtoSelecionado, quantidade);
                    System.out.println("Produto adicionado ao carrinho!");
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }

            System.out.print("Deseja continuar comprando? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        try {
            carrinho.finalizarCompra();
        } catch (Exception e) {
            System.out.println("Erro ao finalizar compra: " + e.getMessage());
        }
    }

    private static void listarProdutos() {
        System.out.println("\n=== LISTA DE PRODUTOS ===");
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : listaProdutos) {
                System.out.printf("ID: %d | Nome: %s | Preço: %.2f | Estoque: %d%n",
                        produto.getId(), produto.getNome(), produto.getPreco(), produto.getEstoque());
            }
        }
    }

    private static void listarClientes() {
        System.out.println("\n=== LISTA DE CLIENTES ===");
        if (listaClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : listaClientes) {
                System.out.printf("ID: %d | Nome: %s | Email: %s%n",
                        cliente.getId(), cliente.getNome(), cliente.getEmail());
            }
        }
    }
}
