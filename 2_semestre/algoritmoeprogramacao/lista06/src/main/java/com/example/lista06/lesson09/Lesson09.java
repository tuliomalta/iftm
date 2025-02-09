package com.example.lista06.lesson09;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Lesson09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        Map<Character, Integer> contagemLetras = new LinkedHashMap<>();

        for (char c : texto.toCharArray()) {
            if (c != ' ') {
                contagemLetras.put(c, contagemLetras.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println(contagemLetras);
        scanner.close();
    }
}
