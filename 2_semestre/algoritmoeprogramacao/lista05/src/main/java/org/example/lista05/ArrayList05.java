package org.example.lista05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList05 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite cinco números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
        }

        System.out.println("Qual dos nomes abaixo você deseja excluir da lista?");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println((i + 1) + ". " + nomes.get(i));
        }

        System.out.print("Informe o número correspondente ao nome a ser excluído: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha >= 1 && escolha <= nomes.size()) {
            nomes.remove(escolha - 1);

            System.out.println("Resultado:");
            for (int i = 0; i < nomes.size(); i++) {
                System.out.println((i + 1) + ". " + nomes.get(i));
            }
        } else {
            System.out.println("Escolha inválida.");
        }

        scanner.close();
    }
}
