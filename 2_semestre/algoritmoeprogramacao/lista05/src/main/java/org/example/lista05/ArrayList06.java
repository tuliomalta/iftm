package org.example.lista05;

import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    private String nome;
    private String telefone;
    private String celular;
    private String email;

    public Contato(String nome, String telefone, String celular, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }
}

public class ArrayList06 {
    public static void main(String[] args) {
        ArrayList<Contato> listaContatos = new ArrayList<Contato>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("1. Inserir Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Celular: ");
                    String celular = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Contato contato = new Contato(nome, telefone, celular, email);
                    listaContatos.add(contato);

                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    if (listaContatos.isEmpty()) {
                        System.out.println("Não há contatos cadastrados.");
                    } else {
                        System.out.println("Contatos cadastrados:");
                        for (int i = 0; i < listaContatos.size(); i++) {
                            Contato contatoListado = listaContatos.get(i);
                            System.out.println((i + 1) + ". Nome: " + contatoListado.getNome());
                            System.out.println("Telefone: " + contatoListado.getTelefone());
                            System.out.println("Celular: " + contatoListado.getCelular());
                            System.out.println("Email: " + contatoListado.getEmail());
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
