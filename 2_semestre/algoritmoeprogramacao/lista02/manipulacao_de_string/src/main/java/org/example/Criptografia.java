package org.example;

import java.util.Scanner;

public class Criptografia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número de linhas a serem processadas
        int n = Integer.parseInt(scanner.nextLine());

        // Processa cada linha
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String etapa1 = deslocaTresPosicoes(input);
            String etapa2 = inverteLinha(etapa1);
            String resultadoFinal = deslocaMetadeParaEsquerda(etapa2);
            System.out.println(resultadoFinal);
        }

        scanner.close();
    }

    // Primeira passada: desloca caracteres alfabéticos 3 posições para a direita
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

    // Segunda passada: inverte a linha
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

    // Terceira passada: desloca a segunda metade dos caracteres uma posição para a esquerda
    public static String deslocaMetadeParaEsquerda(String texto) {
        char[] chars = texto.toCharArray();
        int metade = chars.length / 2;

        for (int i = metade; i < chars.length; i++) {
            chars[i] = (char) (chars[i] - 1);
        }

        return String.valueOf(chars);
    }
}
