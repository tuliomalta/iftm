package com.example.lista06.lesson02;

import java.util.HashSet;
import java.util.Scanner;

public class Lesson02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> conjunto1 = new HashSet<>();
        HashSet<Integer> conjunto2 = new HashSet<>();

        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            conjunto1.add(numero);
        }

        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            conjunto2.add(numero);
        }

        HashSet<Integer> intersecao = new HashSet<>();
        for (Integer numero : conjunto1) {
            if (conjunto2.contains(numero)) {
                intersecao.add(numero);
            }
        }

        for (Integer numero : intersecao) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }
}
