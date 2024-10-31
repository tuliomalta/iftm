package org.example;

import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();


    }

    public static Pessoa lePessoa() {


        System.out.print("Digite o nome: ");
        String nome = scanner.next();


        System.out.print("\nDigite o sexo: ");
        char sexo = scanner.next().charAt(0);


        System.out.print("\nDigite o idade: ");
        int idade = scanner.nextInt();


//        scanner.close();

        //instanciando um objeto da classe Pessoa
        Pessoa p = new Pessoa(nome, sexo, idade);
        return p;

    }

    public static Formacao leformacao() {

        boolean concluido;

        System.out.print("Digite o nivel: ");
        String nivel = scanner.next();

        System.out.print("\nDigite o concluído: ");
        if (scanner.next().equals("Sim")) {
            concluido = true;
        } else {
            concluido = false;
        }

        System.out.print("\nDigite o instituição: ");
        String instituicao = scanner.next();

        System.out.print("\nDigite o ano: ");
        int ano = scanner.nextInt();


        //instanciando um objeto da classe Formacao
        Formacao f = new Formacao(nivel, concluido, instituicao, ano);
        return f;
    }

    public static void menu() {

        Pessoa p = null;
        Formacao f = null;

        while (true) {
            System.out.println("-----------------MENU-----------------");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Cadastrar Formação");
            System.out.println("3 - Exibir");
            System.out.println("4 - Atualizar idade");
            System.out.println("5 - Sair");
            System.out.println("-------------------------------------");
            System.out.print("Digite a opção desejada: ");

            switch (scanner.nextInt()) {
                case 1:
                    p = lePessoa();
                    System.out.println(p.exibe());
                    break;
                case 2:
                    f = leformacao();
                    System.out.println(f.exibe());
                    break;
                case 3:
<<<<<<< HEAD
                    Pessoa q = lePessoa();
                    System.out.println(q.exibe());
                    Formacao g = leformacao();
                    System.out.println(g.exibe());
=======
                    if (p != null) {
                        System.out.println(p.exibe());
                        if (f != null) {
                            System.out.println(f.exibe());
                        } else {
                            System.out.println("A formação não foi cadastrada.");
                        }
                    } else {
                        System.out.println("A pessoa não foi cadastrada.");
                    }
                    System.out.println(p.exibe());
>>>>>>> 713dd898dba0b46dee1af3fd3448d37768d158df
                    break;
                case 4:
                    System.out.print("Digite a nova idade: ");
                    if (p.idade > 0) {
                        p.setIdade(scanner.nextInt());
                    } else {
                        System.out.println("Idade inválida.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        }

    }
}