package recursividadeA;

import java.util.Scanner;

public class SequenciaDeNumerosESoma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            if (m <= 0 || n <= 0) {
                break;
            }

            int menor = Math.min(m, n);
            int maior = Math.max(m, n);

            System.out.print(mostrarSequencia(menor, maior));
            System.out.println("Sum=" + calcularSoma(menor, maior));
        }

        scanner.close();
    }

    public static String mostrarSequencia(int atual, int maior) {
        if (atual > maior) {
            return "";
        }
        return atual + " " + mostrarSequencia(atual + 1, maior);
    }

    public static int calcularSoma(int atual, int maior) {
        if (atual > maior) {
            return 0;
        }
        return atual + calcularSoma(atual + 1, maior);
    }
}
