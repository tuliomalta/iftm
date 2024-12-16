package org.example;

import java.util.Scanner;


public class ValidarValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexValor = "^R[$] ([1-9][0-9]{2,4}[.][0-9]{2})$";

        String textoEntrada = scanner.nextLine();

        if (textoEntrada.matches(regexValor)) {
            System.out.println("Valor válido");
        } else {
            System.out.println("Valor inválido");
        }

        scanner.close();
    }
}


