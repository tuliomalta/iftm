package org.example;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String formula = scanner.nextLine();
        String[] partes = formula.split("\\s+");

        if (partes.length != 3) {
            System.out.println("Formula invalida.");
            return;
        }

        try {
            double num1 = Double.parseDouble(partes[0]);
            double num2 = Double.parseDouble(partes[2]);
            String operador = partes[1];

            double resultado = 0;

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Formula invalida.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Formula invalida.");
                    return;
            }

            System.out.println(resultado);

        } catch (NumberFormatException e) {
            System.out.println("Formula invalida.");
        }

        scanner.close();
    }
}
