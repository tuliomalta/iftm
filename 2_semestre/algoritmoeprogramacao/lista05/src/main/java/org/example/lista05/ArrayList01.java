package org.example.lista05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número inteiro positivo: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                listaNumeros.add(numero);
                soma += numero;
            }
        } while (numero >= 0);

        System.out.println(listaNumeros.size());
        System.out.println("soma = " + soma);
    }
}
