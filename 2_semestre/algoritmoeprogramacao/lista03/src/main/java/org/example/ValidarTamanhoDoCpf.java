package org.example;

import java.util.Scanner;

public class ValidarTamanhoDoCpf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cpf = scanner.nextLine();

        if (cpf.length() == 11) {
            System.out.println("valido");
        } else {
            System.out.println("invalido");
        }

        scanner.close();
    }
}
