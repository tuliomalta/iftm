package recursividadeA;

import java.util.Scanner;

public class FibonacciQuantasChamadas {

    static int numCalls;

    public static int fibonacci(int n) {
        numCalls++;
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            numCalls = 0;
            fibonacci(X);
            System.out.printf("fib(%d) = %d calls = %d\n", X, numCalls - 1, fibonacci(X));
        }

        scanner.close();
    }
}
