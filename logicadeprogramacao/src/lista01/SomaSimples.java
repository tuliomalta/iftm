package lista01;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A, B, SOMA;

        A = scanner.nextInt();
        B = scanner.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        scanner.close();

    }
}
