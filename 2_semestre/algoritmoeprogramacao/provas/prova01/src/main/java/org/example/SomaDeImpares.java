package org.example;


import java.util.Scanner;

public class SomaDeImpares {

    public static int somarImpares(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n % 2 == 1) {
            return n + somarImpares(n - 2);
        } else {
            return somarImpares(n - 1);
        }
    }

    public static void imprimirImpares(int n) {
        if (n <= 0) {
            return;
        }
        if (n % 2 == 1) {
            if (n > 1) {
                imprimirImpares(n - 2);
                System.out.print(" + " + n);
            } else {
                System.out.print(n);
            }
        } else {
            imprimirImpares(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        n = scanner.nextInt();

        if (n <= 1 || n >= 10000) {
            return;
        }

        imprimirImpares(n);
        System.out.print(" = " + somarImpares(n));

        scanner.close();
    }
}