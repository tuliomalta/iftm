package org.example;

import java.util.Scanner;

public class ImprimirIniciaisDasPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String T = scanner.nextLine();
        String[] palavras = T.split("\\s+");

        for (String palavra : palavras) {
            if (palavra.length() > 3) {
                System.out.println(palavra.substring(0, 3));
            }
        }

        scanner.close();
    }
}
