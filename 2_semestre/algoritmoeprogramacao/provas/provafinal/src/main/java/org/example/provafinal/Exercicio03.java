package org.example.provafinal;

import java.util.*;


public class Exercicio03 {
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
            System.out.println("6. Listar nomes de Tutores (sem repetição)");
            System.out.println("7. Sair");
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
                    if (animais.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado.");
                    } else {
                        // Usando um HashSet para armazenar nomes de tutores sem repetição
                        Set<String> tutores = new HashSet<>();
                        for (Animal animal : animais) {
                            tutores.add(animal.getNomeTutor());
                        }

                        System.out.println("Nomes dos Tutores (sem repetição):");
                        for (String tutor : tutores) {
                            System.out.println(tutor);
                        }
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);

        scanner.close();
    }
}