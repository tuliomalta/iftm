package org.example;

import java.util.Scanner;

public class ComparacaoDeStringDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase = scanner.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            System.out.println(i + " - " + frase.charAt(i));
        }

        scanner.close();
    }
}
