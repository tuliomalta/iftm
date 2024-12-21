package org.example.prova02;

import java.util.Scanner;

public class ValidarCnpj {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cnpjRegex = "^(\\d{2}[.]\\d{3}[.]\\d{3}[/]\\d{4}[-]\\d{2}|\\d{14})$";

        String cnpj = scanner.nextLine();

        if (cnpj.matches(cnpjRegex)) {
            System.out.println("CNPJ válido");
        } else {
            System.out.println("CNPJ inválido");
        }
    }
}
