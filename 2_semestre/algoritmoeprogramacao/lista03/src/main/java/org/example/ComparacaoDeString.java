package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ComparacaoDeString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();
        String y = scanner.nextLine();

        boolean saoIguais = x.equals(y);

        if (saoIguais) {
            System.out.println("correto");
        } else {
            System.out.println("incorreto");
        }
    }
}
