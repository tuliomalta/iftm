package com.example.lista06.lesson05;

import java.util.HashSet;
import java.util.Scanner;

public class Lesson05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> listaConvidados = new HashSet<>();
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar convidado");
            System.out.println("2. Remover convidado");
            System.out.println("3. Verificar se um convidado está na lista");
            System.out.println("4. Exibir todos os convidados");
            System.out.println("5. Quantidade de convidados cadastrados");
            System.out.println("6. Apagar todos os convidados");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do convidado: ");
                    String nomeAdicionar = scanner.nextLine();
                    listaConvidados.add(nomeAdicionar);
                    System.out.println("Convidado adicionado!");
                    break;

                case 2:
                    System.out.print("Digite o nome do convidado a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    if (listaConvidados.remove(nomeRemover)) {
                        System.out.println("Convidado removido!");
                    } else {
                        System.out.println("Convidado não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do convidado para verificar: ");
                    String nomeVerificar = scanner.nextLine();
                    if (listaConvidados.contains(nomeVerificar)) {
                        System.out.println("Convidado está na lista.");
                    } else {
                        System.out.println("Convidado não está na lista.");
                    }
                    break;

                case 4:
                    if (listaConvidados.isEmpty()) {
                        System.out.println("Sem convidados cadastrados.");
                    } else {
                        System.out.println("Lista de convidados:");
                        for (String convidado : listaConvidados) {
                            System.out.println(convidado);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Quantidade de convidados: " + listaConvidados.size());
                    break;

                case 6:
                    listaConvidados.clear();
                    System.out.println("Todos os convidados foram removidos.");
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