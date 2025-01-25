package org.example.lista05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaConvidados = new ArrayList<>();

        System.out.println("Digite os nomes dos convidados (ou 'fim' para encerrar):");

        while (true) {
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            if (listaConvidados.contains(nome)) {
                System.out.println("convidado existe");
            } else {
                listaConvidados.add(nome);
            }
        }

        System.out.println("Lista de convidados: " + String.join("-", listaConvidados));

        System.out.print("Digite um nome para pesquisar: ");
        String nomePesquisa = scanner.nextLine();

        if (listaConvidados.contains(nomePesquisa)) {
            System.out.println(nomePesquisa);
        } else {
            System.out.println("Não existe convidado chamado " + nomePesquisa);
        }
    }
}