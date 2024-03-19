package lista01;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int codigoPeca01 = s.nextInt();
        int numeroPeca01 = s.nextInt();
        double valorPeca01 = s.nextDouble();

        int codigoPeca02 = s.nextInt();
        int numeroPeca02 = s.nextInt();
        double valorPeca02 = s.nextDouble();

        double totalPgto01 = numeroPeca01 * valorPeca01;

        double totalPgto02 = numeroPeca02 * valorPeca02;

        double valorTotal = totalPgto01 + totalPgto02;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

    }
}
