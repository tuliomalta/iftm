package com.example.lista06.lesson03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Lesson03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listaComDuplicados = new ArrayList<>();

        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            listaComDuplicados.add(numero);
        }

        HashSet<Integer> conjuntoSemDuplicados = new HashSet<>(listaComDuplicados);
        List<Integer> listaSemDuplicados = new ArrayList<>(conjuntoSemDuplicados);

        for (Integer numero : listaSemDuplicados) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }
}