package org.example;

import java.util.Scanner;

public class SomaRecursivaDeDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int resultado = somaRecursiva(n);
        System.out.println(resultado);
        scanner.close();
    }

    public static int somaRecursiva(int n) {
        if (n < 10) {
            return n;
        }
        return somaRecursiva(somaDigitos(n));
    }

    public static int somaDigitos(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + somaDigitos(n / 10);
    }

}
