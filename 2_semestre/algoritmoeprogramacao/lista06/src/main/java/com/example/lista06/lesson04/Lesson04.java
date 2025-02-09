package com.example.lista06.lesson04;

import java.util.HashSet;
import java.util.Scanner;

public class Lesson04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> conjuntoStrings = new HashSet<>();

        while (true) {
            String palavra = scanner.nextLine();
            if (palavra.equalsIgnoreCase("fim")) {
                break;
            }
            conjuntoStrings.add(palavra);
        }

        String palavraVerificar = scanner.nextLine();

        if (conjuntoStrings.contains(palavraVerificar)) {
            System.out.println("Existe");
        } else {
            System.out.println("Não existe");
        }

        scanner.close();
    }
}
