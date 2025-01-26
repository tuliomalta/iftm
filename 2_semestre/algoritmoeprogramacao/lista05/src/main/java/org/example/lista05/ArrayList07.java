package org.example.lista05;

import java.util.ArrayList;
import java.util.Scanner;

class Cliente {
    private String nome;
    private String cpf;
    private int idade;

    public Cliente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }
}

public class ArrayList07 {
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("1. Inserir novo Cliente");
            System.out.println("2. Listar todos os clientes");
            System.out.println("3. Buscar Cliente pelo CPF");
            System.out.println("4. Remover cliente pelo CPF");
            System.out.println("5. Apagar Lista");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    Cliente cliente = new Cliente(nome, cpf, idade);
                    listaClientes.add(cliente);

                    System.out.println("Cliente adicionado com sucesso!");
                    break;
                case 2:
                    if (listaClientes.isEmpty()) {
                        System.out.println("Não há clientes cadastrados.");
                    } else {
                        System.out.println("Clientes cadastrados:");
                        for (int i = 0; i < listaClientes.size(); i++) {
                            Cliente clienteListado = listaClientes.get(i);
                            System.out.println((i + 1) + ". Nome: " + clienteListado.getNome());
                            System.out.println("CPF: " + clienteListado.getCpf());
                            System.out.println("Idade: " + clienteListado.getIdade());
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.print("CPF do cliente a buscar: ");
                    String cpfBuscar = scanner.nextLine();

                    boolean encontrado = false;
                    Cliente clienteEncontrado = null;
                    for (Object obj : listaClientes) {
                        clienteEncontrado = (Cliente) obj;
                        if (clienteEncontrado.getCpf().equals(cpfBuscar)) {
                            System.out.println("Cliente encontrado:");
                            System.out.println("Nome: " + clienteEncontrado.getNome());
                            System.out.println("CPF: " + clienteEncontrado.getCpf());
                            System.out.println("Idade: " + clienteEncontrado.getIdade());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("CPF do cliente a remover: ");
                    String cpfRemover = scanner.nextLine();

                    boolean removido = false;
                    Cliente clienteRemover = null;
                    for (int i = 0; i < listaClientes.size(); i++) {
                        clienteRemover = listaClientes.get(i);
                        if (clienteRemover.getCpf().equals(cpfRemover)) {
                            listaClientes.remove(i);
                            System.out.println("Cliente removido com sucesso!");
                            removido = true;
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("Cliente não encontrado.");
                    } else {
                        System.out.println("Lista atualizada:");
                        for (int i = 0; i < listaClientes.size(); i++) {
                            Cliente clienteListado = listaClientes.get(i);
                            System.out.println((i + 1) + ". Nome: " + clienteListado.getNome());
                            System.out.println("CPF: " + clienteListado.getCpf());
                            System.out.println("Idade: " + clienteListado.getIdade());
                            System.out.println();
                        }
                    }
                    break;
                case 5:
                    listaClientes.clear();
                    System.out.println("Lista apagada com sucesso!");
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
