package com.example.lista01b;

import java.util.Scanner;

public class SomarElementosVetor {

    public static int somarVetor(int[] vetor, int posicao) {
        if (posicao == vetor.length) {
            return 0;
        }
        return vetor[posicao] + somarVetor(vetor, posicao + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }

        int resultado = somarVetor(vetor, 0);
        System.out.println(resultado);

        scanner.close();
    }
}
