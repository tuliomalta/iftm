package org.example.solid;

import java.util.InputMismatchException;
import java.util.Scanner;


public class SistemaColaboradores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ColaboradorArquivo arquivo = new ColaboradorArquivo();
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar colaborador");
            System.out.println("2 - Listar colaboradores");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // limpar buffer
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número válido.");
                scanner.nextLine(); // limpar buffer incorreto
                continue;
            }

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do colaborador: ");
                    String nome = scanner.nextLine();
                    System.out.print("Cargo do colaborador: ");
                    String cargo = scanner.nextLine();
                    Colaborador colaborador = new Colaborador(nome, cargo);
                    arquivo.salvar(colaborador);
                    System.out.println("Colaborador salvo com sucesso!");
                }
                case 2 -> {
                    System.out.println("=== Lista de Colaboradores ===");
                    arquivo.exibir();
                }
                case 3 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        }

        scanner.close();
    }
}