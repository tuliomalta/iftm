package org.example;

import java.util.Scanner;

public class Led {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ledsPorDigito = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String numero = scanner.nextLine();
            int totalLeds = calculaLedsNecessarios(numero, ledsPorDigito);
            System.out.println(totalLeds + " leds");
        }

        scanner.close();
    }

    public static int calculaLedsNecessarios(String numero, int[] ledsPorDigito) {
        int totalLeds = 0;

        for (int i = 0; i < numero.length(); i++) {
            int digito = numero.charAt(i) - '0';
            totalLeds += ledsPorDigito[digito];
        }

        return totalLeds;
    }
}
