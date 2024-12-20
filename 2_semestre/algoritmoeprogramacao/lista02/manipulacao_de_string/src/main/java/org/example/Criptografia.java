package org.example;

import java.util.Scanner;

public class Criptografia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String etapa1 = deslocaTresPosicoes(input);
            String etapa2 = inverteLinha(etapa1);
            String resultadoFinal = deslocaMetadeParaEsquerda(etapa2);
            System.out.println(resultadoFinal);
        }

        scanner.close();
    }

    public static String deslocaTresPosicoes(String texto) {
        char[] chars = texto.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                chars[i] = (char) (c + 3);
            }
        }

        return String.valueOf(chars);
    }

    public static String inverteLinha(String texto) {
        char[] chars = texto.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[n - i - 1];
            chars[n - i - 1] = temp;
        }

        return String.valueOf(chars);
    }

    public static String deslocaMetadeParaEsquerda(String texto) {
        char[] chars = texto.toCharArray();
        int metade = chars.length / 2;

        for (int i = metade; i < chars.length; i++) {
            chars[i] = (char) (chars[i] - 1);
        }

        return String.valueOf(chars);
    }
}
