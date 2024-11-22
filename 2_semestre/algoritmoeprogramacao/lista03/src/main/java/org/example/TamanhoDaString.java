package org.example;

import java.util.Scanner;

public class TamanhoDaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();

        if (texto.length() <= 10) {
            System.out.println("pequeno");
        } else {
            System.out.println("grande");
        }

        scanner.close();
    }
}
