package recursividadeA;

import java.util.Scanner;

public class FatorialSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(calcularFatorial(n));
        scanner.close();
    }

    public static int calcularFatorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }
}
