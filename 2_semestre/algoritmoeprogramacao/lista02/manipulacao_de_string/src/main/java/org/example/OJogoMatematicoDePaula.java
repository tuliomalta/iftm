package org.example;

import java.util.Scanner;

public class OJogoMatematicoDePaula {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String sequencia = scanner.nextLine();
            int resultado = calculaResultado(sequencia);
            System.out.println(resultado);
        }

        scanner.close();
    }

    public static int calculaResultado(String sequencia) {
        int primeiroDigito = sequencia.charAt(0) - '0';
        char letra = sequencia.charAt(1);
        int segundoDigito = sequencia.charAt(2) - '0';

        if (primeiroDigito == segundoDigito) {
            return primeiroDigito * segundoDigito;
        }

        if (letra >= 'A' && letra <= 'Z') {
            return segundoDigito - primeiroDigito;
        }

        return primeiroDigito + segundoDigito;
    }
}