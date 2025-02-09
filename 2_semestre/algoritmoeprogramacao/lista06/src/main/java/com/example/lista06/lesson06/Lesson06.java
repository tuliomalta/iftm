package com.example.lista06.lesson06;

import java.util.HashMap;
import java.util.Scanner;

public class Lesson06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> mapaOcorrencias = new HashMap<>();

        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }

            if (mapaOcorrencias.containsKey(numero)) {
                mapaOcorrencias.put(numero, mapaOcorrencias.get(numero) + 1);
            } else {
                mapaOcorrencias.put(numero, 1);
            }
        }

        for (HashMap.Entry<Integer, Integer> entrada : mapaOcorrencias.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        scanner.close();
    }
}
