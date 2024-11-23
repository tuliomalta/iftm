package org.example;

import java.util.Scanner;

public class ModificandoFraseEComparando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        String[] palavras = frase.split("\\s+");

        if (palavras.length < 3) {
            System.out.println("Frase invalida.");
        } else {
            String fraseModificada = frase.replaceAll("[aA]", "@");
            System.out.println(fraseModificada);

            String palavra1 = palavras[0].replaceAll("[aA]", "@");
            String palavra2 = palavras[palavras.length - 1].replaceAll("[aA]", "@");

            if (palavra1.compareTo(palavra2) < 0) {
                System.out.println("palavra1 < palavra2");
            } else if (palavra1.compareTo(palavra2) > 0) {
                System.out.println("palavra1 > palavra2");
            } else {
                System.out.println("palavra1 == palavra2");
            }
        }

        scanner.close();
    }
}
