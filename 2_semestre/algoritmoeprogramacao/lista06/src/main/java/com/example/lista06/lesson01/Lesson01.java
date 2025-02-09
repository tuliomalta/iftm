package com.example.lista06.lesson01;

import java.util.HashSet;
import java.util.Scanner;

public class Lesson01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Aluno> alunos = new HashSet<>();

        while (true) {
            System.out.print("Digite a matrícula: ");
            String matricula = scanner.nextLine();

            if (matricula.equals("0")) {
                break;
            }

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            Aluno aluno = new Aluno(matricula, nome);
            alunos.add(aluno);
        }

        System.out.println("Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }

        scanner.close();
    }
}
