package org.example.lista05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        System.out.print("Digite a quantidade de números a serem inseridos: ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número: ");
            int numero = scanner.nextInt();
            listaNumeros.add(numero);
        }

        System.out.println(listaNumeros);

        int soma = 0;
        for (int numero : listaNumeros) {
            soma += numero;
        }
        System.out.println(soma);

        int maior = listaNumeros.get(0);
        for (int numero : listaNumeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println(maior);

        for (int i = listaNumeros.size() - 1; i >= 0; i--) {
            if (listaNumeros.get(i) % 2 != 0) {
                listaNumeros.remove(i);
            }
        }

        System.out.println(listaNumeros);
    }
}