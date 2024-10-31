package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }

    public static JogadorDeFutebol leDados() {

        System.out.println("Digite o nome do jogador: ");
        String nome = scanner.next();

        System.out.println("Digite a posição do jogador: ");
        String posicao = scanner.next();

        System.out.println("Digite o ano de nascimento do jogador: ");
        int anoDeNascimento = scanner.nextInt();

        System.out.println("Digite a nacionalidade do jogador: ");
        String nacionalidade = scanner.next();

        System.out.println("Digite a altura do jogador: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o peso do jogador: ");
        double peso = scanner.nextDouble();

        JogadorDeFutebol jogador = new JogadorDeFutebol(nome, posicao, anoDeNascimento, nacionalidade, altura, peso);
        return jogador;
    }

    public static int calculaIdade(int anoDeNascimento) {
        int anoAtual = LocalDateTime.now().getYear();
        return  anoAtual - anoDeNascimento;

    }
}