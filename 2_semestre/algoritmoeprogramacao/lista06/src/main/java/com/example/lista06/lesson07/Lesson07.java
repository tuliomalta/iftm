package com.example.lista06.lesson07;

import java.util.HashMap;
import java.util.Scanner;

public class Lesson07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> mapaOriginal = new HashMap<>();

        while (true) {
            String chave = scanner.next();

            if (chave.equalsIgnoreCase("Fim")) {
                break;
            }

            int valor = scanner.nextInt();

            mapaOriginal.put(chave, valor);
        }

        HashMap<Integer, String> mapaInvertido = new HashMap<>();
        for (HashMap.Entry<String, Integer> entrada : mapaOriginal.entrySet()) {
            mapaInvertido.put(entrada.getValue(), entrada.getKey());
        }

        System.out.println(mapaInvertido);

        scanner.close();
    }
}
