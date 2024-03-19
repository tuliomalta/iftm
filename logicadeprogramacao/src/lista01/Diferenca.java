package lista01;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c, d, diferenca;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        diferenca = (a * b - c * d);

        System.out.println("DIFERENCA = " + diferenca);

        scanner.close();

    }
}
