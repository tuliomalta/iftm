package org.example.provafinal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Exercicio02 {
    public static void main(String[] args) {
        Map<String, org.example.provafinal.Animal> animais = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar um animal");
            System.out.println("2. Remover um animal pelo registro");
            System.out.println("3. Imprimir os dados dos animais");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Animal: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade do Animal: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do Tutor: ");
                    String nomeTutor = scanner.nextLine();
                    System.out.print("Registro do Animal: ");
                    String registro = scanner.nextLine();

                    if (animais.containsKey(registro)) {
                        System.out.println("Registro já cadastrado, tente outro.");
                    } else {
                        org.example.provafinal.Animal novoAnimal = new org.example.provafinal.Animal(nome, idade, nomeTutor, registro);
                        animais.put(registro, novoAnimal);
                        System.out.println("Animal adicionado com sucesso!");
                    }
                    break;

                case 2:
                    if (animais.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado.");
                    } else {
                        System.out.print("Digite o registro do animal a ser removido: ");
                        String registroRemover = scanner.nextLine();
                        if (animais.containsKey(registroRemover)) {
                            animais.remove(registroRemover);
                            System.out.println("Animal removido com sucesso!");
                        } else {
                            System.out.println("Registro não encontrado.");
                        }
                    }
                    break;

                case 3:
                    if (animais.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado.");
                    } else {
                        System.out.println("Dados dos Animais:");
                        for (Map.Entry<String, org.example.provafinal.Animal> entry : animais.entrySet()) {
                            System.out.println(entry.getValue());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
