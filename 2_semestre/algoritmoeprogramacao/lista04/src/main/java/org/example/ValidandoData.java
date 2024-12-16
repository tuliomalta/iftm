package org.example;

import java.util.Scanner;

public class ValidandoData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexData = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";

        String dataEntrada = scanner.nextLine();

        if (dataEntrada.matches(regexData)) {
            System.out.println("Data válida");
        } else {
            System.out.println("Data inválida");
        }

        scanner.close();
    }
}

