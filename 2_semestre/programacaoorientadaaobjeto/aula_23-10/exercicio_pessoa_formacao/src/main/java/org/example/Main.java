package org.example;

import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();


    }

    public static Pessoa lePessoa() {

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o sexo: ");
        char sexo = scanner.nextLine().charAt(0);
        System.out.println("Digite o idade: ");
        int idade = scanner.nextInt();

        scanner.close();

        //instanciando um objeto da classe Pessoa
        Pessoa p = new Pessoa(nome, sexo, idade);
        return p;

    }

    public static Formacao leformacao() {

            System.out.println("Digite o nivel: ");
            String nivel = scanner.nextLine();
            System.out.println("Digite o concluído: ");
            boolean concluido = scanner.nextBoolean();
            System.out.println("Digite o instituição: ");
            String instituicao = scanner.nextLine();
            System.out.println("Digite o ano: ");
            int ano = scanner.nextInt();

            scanner.close();

            //instanciando um objeto da classe Formacao
            Formacao f = new Formacao(nivel, concluido, instituicao, ano);
            return f;
    }

    public static void menu() {

        while (true) {
            System.out.println("-----------------MENU-----------------");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Cadastrar Formação");
            System.out.println("3 - Exibir");
            System.out.println("4 - Atualizar idade");
            System.out.println("5 - Sair");

            switch (scanner.nextInt()) {
                case 1:
                    Pessoa p = lePessoa();
                    System.out.println(p.exibe());
                    break;
                case 2:
                    Formacao f = leformacao();
                    System.out.println(f.exibe());
                    break;
                case 3:
                    Pessoa q = lePessoa();
                    System.out.println(q.exibe());
                    Formacao g = leformacao();
                    System.out.println(g.exibe());
                    break;
                case 4:
                    System.out.println("Atualizar idade");
                    break;
                case 5:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }

//        Pessoa p = lePessoa();
//        System.out.println(p.exibe());
//
//        Formacao f = leformacao();
//        System.out.println(f.exibe());
    }
}