import java.util.Scanner;

public class CrescimentoPopulacional {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int PA = scanner.nextInt(); // População da cidade A
            int PB = scanner.nextInt(); // População da cidade B
            double G1 = scanner.nextDouble(); // Taxa de crescimento de A (em %)
            double G2 = scanner.nextDouble(); // Taxa de crescimento de B (em %)

            int anos = 0;

            while (PA <= PB) {
                PA += (int) (PA * G1 / 100); // Atualiza a população de A
                PB += (int) (PB * G2 / 100); // Atualiza a população de B
                anos++;

                if (anos > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }

            if (anos <= 100) {
                System.out.println(anos + " anos.");
            }
        }

        scanner.close();

    }
}
