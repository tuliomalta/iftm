package org.example;

import java.util.Scanner;

public class Led {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Quantidade de LEDs necessária para cada dígito de 0 a 9
        int[] ledsPorDigito = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        // Lê o número de casos de teste
        int n = Integer.parseInt(scanner.nextLine());

        // Processa cada caso de teste
        for (int i = 0; i < n; i++) {
            String numero = scanner.nextLine();
            int totalLeds = calculaLedsNecessarios(numero, ledsPorDigito);
            System.out.println(totalLeds + " leds");
        }

        scanner.close();
    }

    // Função para calcular a quantidade de LEDs necessária para um número
    public static int calculaLedsNecessarios(String numero, int[] ledsPorDigito) {
        int totalLeds = 0;

        // Para cada dígito do número, adiciona a quantidade correspondente de LEDs
        for (int i = 0; i < numero.length(); i++) {
            int digito = numero.charAt(i) - '0'; // Converte o caractere para o número correspondente
            totalLeds += ledsPorDigito[digito];
        }

        return totalLeds;
    }
}
