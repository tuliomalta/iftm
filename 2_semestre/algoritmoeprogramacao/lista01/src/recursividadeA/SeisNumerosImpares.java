package recursividadeA;

import java.util.Scanner;

public class SeisNumerosImpares {

    public static void imprimirImpares(int x, int cont) {
        if (cont == 6) {
            return;
        }

        if (x % 2 != 0) {
            System.out.println(x);
            cont++;
        }

        imprimirImpares(x + 1, cont);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        imprimirImpares(X, 0);
        sc.close();
    }
}
