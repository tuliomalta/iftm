package lista01;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroFuncionario = scanner.nextInt();

        int horasTrabalhadas = scanner.nextInt();

        double valorPorHora = scanner.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        scanner.close();

        System.out.printf("NUMBER = %d\n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        scanner.close();

    }
}
