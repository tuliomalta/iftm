package recursividadeA;

import java.util.Scanner;

public class QuadradoDePares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        if (n > 5 && n < 2000) {
            exibirQuadradosPares(2, n);
        }
    }

    public static void exibirQuadradosPares(int atual, int limite) {
        if (atual > limite) {
            return;
        }

        System.out.println(atual + "^2 = " + (atual * atual));

        exibirQuadradosPares(atual + 2, limite);
    }
}
