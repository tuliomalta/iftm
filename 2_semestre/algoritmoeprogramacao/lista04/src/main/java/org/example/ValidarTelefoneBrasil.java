package org.example;

import java.util.Scanner;

public class ValidarTelefoneBrasil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexTelefone = "^[(][1-9]{2}[)] (9\\d{4}-\\d{4}|\\d{4}-\\d{4})$";

        String numeroEntrada = scanner.nextLine();

        if (numeroEntrada.matches(regexTelefone)) {
            if (numeroEntrada.contains(" 9")) {
                System.out.println("Celular");
            } else {
                System.out.println("Fixo");
            }
        } else {
            System.out.println("Inválido");
        }

        scanner.close();
    }
}

