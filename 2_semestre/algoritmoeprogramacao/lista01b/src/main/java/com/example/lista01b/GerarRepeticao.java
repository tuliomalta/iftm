package com.example.lista01b;

import java.util.Scanner;

public class GerarRepeticao {

    public static void imprimirNumero(int t, int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(t);
        if (n > 1) {
            System.out.print("-");
        }
        imprimirNumero(t, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n = scanner.nextInt();
        imprimirNumero(t, n);
        System.out.println();
        scanner.close();
    }
}
