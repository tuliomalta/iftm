package com.example.lista06.lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Aluno> alunos = new HashMap<>();
        Map<String, Double> notas = new HashMap<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("a) Adicionar um aluno.");
            System.out.println("b) Adicionar uma nota a um aluno.");
            System.out.println("c) Calcular a média das notas de todos os alunos.");
            System.out.println("d) Imprimir os dados dos alunos.");
            System.out.println("e) Sair.");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "a":
                    System.out.print("Digite a matrícula: ");
                    String matricula = scanner.nextLine();

                    if (alunos.containsKey(matricula)) {
                        System.out.println("Matrícula já cadastrada, tente outra.");
                        break;
                    }

                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o CPF: ");
                    String cpf = scanner.nextLine();

                    boolean cpfExistente = false;
                    for (Aluno aluno : alunos.values()) {
                        if (aluno.getCpf().equals(cpf)) {
                            cpfExistente = true;
                            break;
                        }
                    }

                    if (cpfExistente) {
                        System.out.println("CPF já cadastrado, tente outro.");
                    } else {
                        alunos.put(matricula, new Aluno(matricula, nome, cpf));
                        System.out.println("Aluno adicionado com sucesso!");
                    }
                    break;

                case "b":
                    System.out.print("Digite a matrícula do aluno: ");
                    String matriculaNota = scanner.nextLine();
                    if (alunos.containsKey(matriculaNota)) {
                        System.out.print("Digite a nota: ");
                        double nota = Double.parseDouble(scanner.nextLine());
                        notas.put(matriculaNota, nota);
                        System.out.println("Nota adicionada com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case "c":
                    if (notas.isEmpty()) {
                        System.out.println("Nenhuma nota cadastrada.");
                    } else {
                        double soma = 0;
                        for (double nota : notas.values()) {
                            soma += nota;
                        }
                        double media = soma / notas.size();
                        System.out.println("Média das notas: " + media);
                    }
                    break;

                case "d":
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Aluno aluno : alunos.values()) {
                            System.out.println(aluno);
                            if (notas.containsKey(aluno.getMatricula())) {
                                System.out.println("Nota: " + notas.get(aluno.getMatricula()));
                            } else {
                                System.out.println("Nota: N/A");
                            }
                        }
                    }
                    break;

                case "e":
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}