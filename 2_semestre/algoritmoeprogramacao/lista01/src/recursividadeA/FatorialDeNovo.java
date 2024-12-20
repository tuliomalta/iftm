package recursividadeA;

import java.util.Scanner;

public class FatorialDeNovo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String numeroACM = scanner.nextLine();
            if (numeroACM.equals("0")) {
                break;
            }
            System.out.println(converterParaDecimal(numeroACM, 1));
        }
        scanner.close();
    }

    public static int converterParaDecimal(String numeroACM, int posicao) {
        if (posicao > numeroACM.length()) {
            return 0;
        }

        int digito = Character.getNumericValue(numeroACM.charAt(numeroACM.length() - posicao));
        return digito * fatorial(posicao) + converterParaDecimal(numeroACM, posicao + 1);
    }

    public static int fatorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}
