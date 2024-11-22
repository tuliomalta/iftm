package org.example;

import java.util.Scanner;

public class CapturarUmCaracterNaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase = scanner.nextLine();

        if (frase.length() < 5) {
            System.out.println("invalida");
        } else {
            char primeiroCaractere = frase.charAt(0);
            char ultimoCaractere = frase.charAt(frase.length() - 1);

            if (primeiroCaractere == ultimoCaractere) {
                System.out.println("iguais");
            } else {
                System.out.println("diferentes");
            }
        }

        scanner.close();
    }
}
