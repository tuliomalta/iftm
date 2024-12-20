package recursividadeA;

import java.util.Scanner;

public class RestoDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        imprimirNumeros(1, n);
    }

    public static void imprimirNumeros(int atual, int divisor) {
        if (atual > 10000) {
            return;
        }

        if (atual % divisor == 2) {
            System.out.println(atual);
        }

        imprimirNumeros(atual + 1, divisor);
    }
}

