package com.example.lista06.lesson08;

import java.util.HashMap;
import java.util.Scanner;

public class Lesson08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Produto> mapaProdutos = new HashMap<>();
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar um produto");
            System.out.println("2. Buscar um produto pelo ID");
            System.out.println("3. Remover um produto pelo ID");
            System.out.println("4. Listar todos os produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do produto: ");
                    String idAdicionar = scanner.nextLine();

                    // Verifica se o ID já existe
                    if (mapaProdutos.containsKey(idAdicionar)) {
                        System.out.println("ID já utilizada, insira outra.");
                    } else {
                        System.out.print("Digite o nome do produto: ");
                        String nomeAdicionar = scanner.nextLine();
                        mapaProdutos.put(idAdicionar, new Produto(idAdicionar, nomeAdicionar));
                        System.out.println("Produto adicionado!");
                    }
                    break;

                case 2:
                    System.out.print("Digite o ID do produto a ser buscado: ");
                    String idBuscar = scanner.nextLine();
                    Produto produtoBuscar = mapaProdutos.get(idBuscar);
                    if (produtoBuscar != null) {
                        System.out.println("Produto encontrado: " + produtoBuscar);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID do produto a ser removido: ");
                    String idRemover = scanner.nextLine();
                    Produto produtoRemover = mapaProdutos.remove(idRemover);
                    if (produtoRemover != null) {
                        System.out.println("Produto removido: " + produtoRemover);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    if (mapaProdutos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("Lista de produtos:");
                        for (Produto produto : mapaProdutos.values()) {
                            System.out.println(produto);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}