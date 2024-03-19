package lista01;

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int X = A * B;

        System.out.println("PROD = " + X);

        scanner.close();

    }
}
