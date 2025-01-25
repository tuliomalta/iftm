package org.example.lista05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String nome;

        do {
            System.out.print("Digite um nome (ou 'FIM' para finalizar): ");
            nome = scanner.nextLine();

            if (!nome.equalsIgnoreCase("FIM")) {
                listaNomes.add(nome);
            }
        } while (!nome.equalsIgnoreCase("FIM"));

        System.out.println("Nomes cadastrados em ordem inversa:");

        for (int i = listaNomes.size() - 1; i >= 0; i--) {
            System.out.println(listaNomes.get(i));
        }
    }
}
