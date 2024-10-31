package org.example;

import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        JogadorDeFutebol jogador = leDados();
        int idade = JogadorDeFutebol.calculaIdade(jogador.anoDeNascimento);
        System.out.println(jogador.exibe());
        tempoAposentadoria(jogador, idade);

    }

    public static JogadorDeFutebol leDados() {

        System.out.print("Digite o nome do jogador: ");
        String nome = scanner.next();

        System.out.print("\nDigite a posição do jogador: ");
        String posicao = scanner.next();

        System.out.print("\nDigite o ano de nascimento do jogador: ");
        int anoDeNascimento = scanner.nextInt();

        System.out.print("\nDigite a nacionalidade do jogador: ");
        String nacionalidade = scanner.next();

        System.out.print("\nDigite a altura do jogador: ");
        double altura = scanner.nextDouble();

        System.out.print("\nDigite o peso do jogador: ");
        double peso = scanner.nextDouble();

        JogadorDeFutebol jogador = new JogadorDeFutebol(nome, posicao, anoDeNascimento, nacionalidade, altura, peso);
        return jogador;
    }

    public static void tempoAposentadoria(JogadorDeFutebol jogador, int idade) {
        System.out.println("---------------------------------");
        if (jogador.posicao.equals("Ataque")) {
            if (idade < 35) {
                System.out.println("Faltam " + diferencaIdade(idade,35) + " anos para o jogador " + jogador.getNome() + " se aposentar.");
            } else {
                System.out.println("O jogador " + jogador.getNome() + " já está aposentado.");
            }
        } else if (jogador.posicao.equals("Meio-campo")) {
            if (idade < 38) {
                System.out.println("Faltam " + diferencaIdade(idade, 38) + " anos para o jogador " + jogador.getNome() + " se aposentar.");
            } else {
                System.out.println("O jogador " + jogador.getNome() + " já está aposentado.");
            }
        } else {
            if (idade < 40) {
                System.out.println("Faltam " + diferencaIdade(idade, 40) + " anos para o jogador " + jogador.getNome() + " se aposentar.");
            } else {
                System.out.println("O jogador " + jogador.getNome() + " já está aposentado.");
            }
        }
    }

    public static int diferencaIdade(int idade, int idadeAposentadoria) {
        return idadeAposentadoria - idade;
    }
}