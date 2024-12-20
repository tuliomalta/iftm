package recursividadeA;

import java.util.Scanner;

public class FibonacciFacil {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(fibonacci(i));
        }
        System.out.println();
        scanner.close();
    }
}
