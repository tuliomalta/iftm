package recursividadeA;

import java.util.Scanner;

public class CrescimentoPopulacional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int pa = scanner.nextInt();
            int pb = scanner.nextInt();
            double g1 = scanner.nextDouble();
            double g2 = scanner.nextDouble();

            int anos = calcularAnos(pa, pb, g1, g2, 0);

            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }

        scanner.close();
    }

    public static int calcularAnos(int pa, int pb, double g1, double g2, int anos) {
        if (anos > 100 || pa > pb) {
            return anos;
        }

        pa += (int) (pa * g1 / 100);
        pb += (int) (pb * g2 / 100);

        return calcularAnos(pa, pb, g1, g2, anos + 1);
    }
}
