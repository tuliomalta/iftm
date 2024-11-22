package org.example;

import java.text.Normalizer;
import java.util.Scanner;

public class ContarOcorrenciasDePalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String T = scanner.nextLine();
        String S = scanner.nextLine();

        T = removerAcentos(T).toLowerCase();
        S = removerAcentos(S).toLowerCase();

        String[] palavras = T.split("\\s+");

        int count = 0;

        for (String palavra : palavras) {
            if (palavra.contains(S)) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }

    public static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
