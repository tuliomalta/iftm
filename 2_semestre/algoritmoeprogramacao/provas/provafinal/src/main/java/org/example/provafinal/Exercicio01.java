package org.example.provafinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir novo Animal");
            System.out.println("2. Listar todos os animais");
            System.out.println("3. Listar Animais Filhotes (<2 anos)");
            System.out.println("4. Buscar Animal pelo nome do Tutor");
            System.out.println("5. Apagar Lista");
            System.out.println("6. Sair");
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

                    // Verifica se o registro já existe
                    boolean registroExistente = false;
                    for (Animal animal : animais) {
                        if (animal.getRegistro().equalsIgnoreCase(registro)) {
                            registroExistente = true;
                            break;
                        }
                    }

                    if (registroExistente) {
                        System.out.println("Registro já cadastrado, tente outro.");
                    } else {
                        Animal novoAnimal = new Animal(nome, idade, nomeTutor, registro);
                        animais.add(novoAnimal);
                        System.out.println("Animal adicionado com sucesso!");
                    }
                    break;

                case 2:
                    if (animais.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado.");
                    } else {
                        System.out.println("Lista de Animais:");
                        for (Animal animal : animais) {
                            System.out.println(animal);
                        }
                    }
                    break;

                case 3:
                    if (animais.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado.");
                    } else {
                        System.out.println("Animais Filhotes (<2 anos):");
                        for (Animal animal : animais) {
                            if (animal.getIdade() < 2) {
                                System.out.println(animal);
                            }
                        }
                    }
                    break;

                case 4:
                    if (animais.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado.");
                    } else {
                        System.out.print("Digite o nome do Tutor: ");
                        String tutorBusca = scanner.nextLine();
                        System.out.println("Animais do Tutor " + tutorBusca + ":");
                        boolean encontrado = false;
                        for (Animal animal : animais) {
                            if (animal.getNomeTutor().equalsIgnoreCase(tutorBusca)) {
                                System.out.println(animal);
                                encontrado = true;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Nenhum animal encontrado para o tutor informado.");
                        }
                    }
                    break;

                case 5:
                    animais.clear();
                    System.out.println("Lista de animais apagada.");
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}