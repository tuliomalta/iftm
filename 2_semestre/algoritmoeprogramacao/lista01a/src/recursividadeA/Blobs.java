package recursividadeA;

import java.util.Scanner;

public class Blobs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            double comida = scanner.nextDouble();
            int dias = calcularDias(comida, 0);
            System.out.println(dias + " dias");
        }

        scanner.close();
    }

    public static int calcularDias(double comida, int dias) {
        if (comida <= 1) {
            return dias;
        }

        return calcularDias(comida / 2, dias + 1);
    }
}
