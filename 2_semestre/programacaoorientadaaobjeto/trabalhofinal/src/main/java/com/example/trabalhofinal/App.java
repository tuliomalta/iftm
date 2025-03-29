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
            System.out.println("6 - Mostrar Carrinho de Compras");
            System.out.println("7 - Destruir Cliente");
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
                case 6:
                    mostrarCarrinho();
                    break;
                case 7:
                    destruirCliente();
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
        scanner.nextLine();

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

        Cliente cliente = null;
        for (Cliente c : listaClientes) {
            if (c.getId() == clienteId) {
                cliente = c;
                break;
            }
        }

        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        CarrinhoDeCompras carrinho = cliente.getCarrinho();
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
            scanner.nextLine();

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
                    cliente.comprar(produtoSelecionado, quantidade);
                    System.out.println("Produto adicionado ao carrinho!");
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }

            System.out.print("Deseja continuar comprando? (s/n): ");
            continuar = scanner.next().charAt(0);
            scanner.nextLine();
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

    private static void mostrarCarrinho() {
        System.out.println("\n=== MOSTRAR CARRINHO DE COMPRAS ===");
        System.out.print("Digite o ID do cliente: ");
        int clienteId = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        Cliente cliente = null;
        for (Cliente c : listaClientes) {
            if (c.getId() == clienteId) {
                cliente = c;
                break;
            }
        }

        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        CarrinhoDeCompras carrinho = cliente.getCarrinho();
        if (carrinho == null) {
            System.out.println("Carrinho de compras não existe para este cliente.");
            return;
        }

        System.out.println("Produtos no carrinho:");
        List<Produto> produtos = carrinho.getProdutos();
        List<Integer> quantidades = carrinho.getQuantidades();

        if (produtos.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            for (int i = 0; i < produtos.size(); i++) {
                Produto produto = produtos.get(i);
                int quantidade = quantidades.get(i);
                System.out.printf("ID: %d | Nome: %s | Preço: %.2f | Quantidade: %d%n",
                        produto.getId(), produto.getNome(), produto.getPreco(), quantidade);
            }
            System.out.printf("Total: R$%.2f%n", carrinho.calcularTotal());
        }
    }

    private static void destruirCliente() {
        System.out.println("\n=== DESTRUIR CLIENTE ===");
        System.out.print("Digite o ID do cliente a ser destruído: ");
        int clienteId = scanner.nextInt();
        scanner.nextLine();
        Cliente cliente = null;
        for (Cliente c : listaClientes) {
            if (c.getId() == clienteId) {
                cliente = c;
                break;
            }
        }
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }
        System.out.println("\nCarrinho de compras do cliente:");
        CarrinhoDeCompras carrinho = cliente.getCarrinho();
        if (carrinho != null) {
            List<Produto> produtos = carrinho.getProdutos();
            List<Integer> quantidades = carrinho.getQuantidades();

            if (produtos.isEmpty()) {
                System.out.println("O carrinho está vazio.");
            } else {
                for (int i = 0; i < produtos.size(); i++) {
                    Produto produto = produtos.get(i);
                    int quantidade = quantidades.get(i);
                    System.out.printf("ID: %d | Nome: %s | Preço: %.2f | Quantidade: %d%n",
                            produto.getId(), produto.getNome(), produto.getPreco(), quantidade);
                }
                System.out.printf("Total: R$%.2f%n", carrinho.calcularTotal());
            }
        }
        cliente.destroiCliente();
        listaClientes.remove(cliente);
        System.out.println("Cliente e carrinho de compras destruídos com sucesso!");
    }
}