package org.example.prova02;

import java.util.Scanner;

public class MultiplicarASomaDosNumerosDasPalavras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase = scanner.nextLine();

        String[] palavras = frase.split(" ");

        int resultado = 1;

        for (String palavra : palavras) {
            int soma = somarDigitos(palavra);
            if (soma == 0) {
                soma = 1;
            }
            resultado *= soma;
        }

        System.out.println("Resultado = " + resultado);

        scanner.close();
    }

    private static int somarDigitos(String palavra) {
        int soma = 0;
        for (char ch : palavra.toCharArray()) {
            if (Character.isDigit(ch)) {
                soma += Character.getNumericValue(ch);
            }
        }
        return soma;
    }
}
