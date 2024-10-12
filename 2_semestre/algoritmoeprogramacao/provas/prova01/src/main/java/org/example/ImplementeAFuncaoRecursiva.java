package org.example;

import java.util.Scanner;

public class ImplementeAFuncaoRecursiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int resultado = h(m, n);
        System.out.printf("h(%d,%d) = %d%n", m, n, resultado);
        scanner.close();
    }

    public static int h(int m, int n) {
        if (n == 1) {
            return m + 1;
        }
        if (m == 1) {
            return n + 1;
        }
        return h(m, n - 1) + h(m - 1, n);
    }

}
