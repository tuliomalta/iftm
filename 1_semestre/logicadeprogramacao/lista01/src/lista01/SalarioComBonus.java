package lista01;

import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String nome = s.nextLine();

        double salarioFixo = s.nextDouble();

        double totalVendas = s.nextDouble();

        double porcentagemVendas = (double) 15 / 100;

        double salarioTotal = salarioFixo + (totalVendas * porcentagemVendas);

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);

        s.close();

    }
}
