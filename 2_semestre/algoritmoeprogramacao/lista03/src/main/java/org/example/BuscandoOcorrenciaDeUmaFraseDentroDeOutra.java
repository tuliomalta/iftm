package org.example;

import java.text.Normalizer;
import java.util.Scanner;

public class BuscandoOcorrenciaDeUmaFraseDentroDeOutra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        String s1Lower = removerAcentos(s1).toLowerCase();
        String s2Lower = removerAcentos(s2).toLowerCase();

        int index = s1Lower.indexOf(s2Lower);

        if (index != -1) {
            System.out.println(s1.substring(index));
        } else {
            System.out.println(s1);
        }

        scanner.close();
    }

    public static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
