package org.example;

import java.util.Scanner;

public class OJogoMatematicoDePaula {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Lê o número de casos de teste
        int n = Integer.parseInt(scanner.nextLine());

        // Processa cada caso de teste
        for (int i = 0; i < n; i++) {
            String sequencia = scanner.nextLine();
            int resultado = calculaResultado(sequencia);
            System.out.println(resultado);
        }

        scanner.close();
    }

    // Função que calcula o resultado da sequência
    public static int calculaResultado(String sequencia) {
        // Extrai os caracteres da sequência
        int primeiroDigito = sequencia.charAt(0) - '0'; // Converte o primeiro caractere para um número inteiro
        char letra = sequencia.charAt(1);
        int segundoDigito = sequencia.charAt(2) - '0'; // Converte o terceiro caractere para um número inteiro

        // Verifica se os dígitos são iguais
        if (primeiroDigito == segundoDigito) {
            return primeiroDigito * segundoDigito;
        }

        // Se a letra for maiúscula, subtraímos o primeiro dígito do segundo
        if (letra >= 'A' && letra <= 'Z') {
            return segundoDigito - primeiroDigito;
        }

        // Se a letra for minúscula, somamos os dois dígitos
        return primeiroDigito + segundoDigito;
    }

}
