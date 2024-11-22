package org.example;

import java.util.Scanner;

public class CustoDeMoradia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double custo = scanner.nextDouble();
        scanner.nextLine();
        String cidade = scanner.nextLine();

        if (cidade.equalsIgnoreCase("Uberlandia")) {
            System.out.printf("O custo de vida em Uberlandia e R$ %.2f\n", custo);
        } else if (cidade.equalsIgnoreCase("Brasilia")) {
            custo *= 2;
            System.out.printf("O custo de vida em Brasilia e R$ %.2f\n", custo);
        } else {
            custo /= 2;
            System.out.printf("O custo de vida em %s e R$ %.2f\n", cidade, custo);
        }

        scanner.close();
    }

}
