package org.example;

import java.util.Scanner;

public class ValindandoCpf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexCpf = "^(\\d{3}[.]\\d{3}[.]\\d{3}-\\d{2}|\\d{11})$";

        String cpfEntrada = scanner.nextLine();

        if (cpfEntrada.matches(regexCpf)) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }
    }
}
