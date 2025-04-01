package com.example.demo;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu do Sistema Bancário ---");
            System.out.println("1. ContaBancaria");
            System.out.println("2. ContaCo (Conta Corrente)");
            System.out.println("3. ContaPo (Conta Poupança)");
            System.out.println("4. ContaCoPremium (Conta Corrente Premium)");
            System.out.println("5. ContaCoEmpresarial");
            System.out.println("6. ContaPoEstudantil (Conta Poupança Estudantil)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    menuContaBancaria(sc);
                    break;
                case 2:
                    menuContaCo(sc);
                    break;
                case 3:
                    menuContaPo(sc);
                    break;
                case 4:
                    menuContaCoPremium(sc);
                    break;
                case 5:
                    menuContaCoEmpresarial(sc);
                    break;
                case 6:
                    menuContaPoEstudantil(sc);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);

        sc.close();
    }

    public static void menuContaBancaria(Scanner sc) {
        System.out.print("Digite o nome do titular: ");
        String titular = sc.next();
        System.out.print("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(titular, saldo);
        int opcao;

        do {
            System.out.println("\n--- Menu ContaBancaria ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Exibir Saldo");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Valor para depositar: ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                    System.out.println("Depósito realizado.");
                    break;
                case 2:
                    System.out.print("Valor para sacar: ");
                    double saque = sc.nextDouble();
                    try {
                        if (!conta.sacar(saque)) {
                            throw new MinhasExcecoes("Saque não realizado: saldo insuficiente.");
                        } else {
                            System.out.println("Saque realizado.");
                        }
                    } catch(MinhasExcecoes e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(conta.exibeSaldo());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
    }

    public static void menuContaCo(Scanner sc) {
        System.out.print("Digite o nome do titular: ");
        String titular = sc.next();
        System.out.print("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Digite o limite do cheque especial: ");
        double limite = sc.nextDouble();

        ContaCo conta = new ContaCo(titular, saldo, limite);
        int opcao;

        do {
            System.out.println("\n--- Menu ContaCo ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Exibir Saldo");
            System.out.println("4. Exibir Limite do Cheque Especial");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Valor para depositar: ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                    System.out.println("Depósito realizado.");
                    break;
                case 2:
                    System.out.print("Valor para sacar: ");
                    double saque = sc.nextDouble();
                    try {
                        if (!conta.sacar(saque)) {
                            throw new MinhasExcecoes("Saque não realizado: saldo e limite insuficientes.");
                        } else {
                            System.out.println("Saque realizado.");
                        }
                    } catch(MinhasExcecoes e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(conta.exibeSaldo());
                    break;
                case 4:
                    System.out.println(conta.exibeLimiteChequeEspecial());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
    }

    public static void menuContaPo(Scanner sc) {
        System.out.print("Digite o nome do titular: ");
        String titular = sc.next();
        System.out.print("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Digite a taxa de rendimento (em %): ");
        double taxa = sc.nextDouble();

        ContaPo conta = new ContaPo(titular, saldo, taxa);
        int opcao;

        do {
            System.out.println("\n--- Menu ContaPo ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Aplicar Rendimento");
            System.out.println("4. Exibir Saldo");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Valor para depositar: ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                    System.out.println("Depósito realizado.");
                    break;
                case 2:
                    System.out.print("Valor para sacar: ");
                    double saque = sc.nextDouble();
                    try {
                        if (!conta.sacar(saque)) {
                            throw new MinhasExcecoes("Saque não realizado: saldo insuficiente.");
                        } else {
                            System.out.println("Saque realizado.");
                        }
                    } catch(MinhasExcecoes e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    conta.aplicarRendimento();
                    System.out.println("Rendimento aplicado.");
                    break;
                case 4:
                    System.out.println(conta.exibeSaldo());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
    }

    public static void menuContaCoPremium(Scanner sc) {
        System.out.print("Digite o nome do titular: ");
        String titular = sc.next();
        System.out.print("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Digite o limite do cheque especial: ");
        double limite = sc.nextDouble();
        System.out.print("Digite o percentual de cashback: ");
        double cashback = sc.nextDouble();

        ContaCoPremium conta = new ContaCoPremium(titular, saldo, limite, cashback);
        int opcao;

        do {
            System.out.println("\n--- Menu ContaCoPremium ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Exibir Saldo");
            System.out.println("4. Exibir Benefício Premium");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Valor para depositar: ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                    System.out.println("Depósito realizado.");
                    break;
                case 2:
                    System.out.print("Valor para sacar: ");
                    double saque = sc.nextDouble();
                    try {
                        if (!conta.sacar(saque)) {
                            throw new MinhasExcecoes("Saque não realizado: saldo e limite insuficientes.");
                        } else {
                            System.out.println("Saque realizado com cashback.");
                        }
                    } catch(MinhasExcecoes e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(conta.exibeSaldo());
                    break;
                case 4:
                    System.out.println(conta.exibeBeneficioPremium());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
    }

    public static void menuContaCoEmpresarial(Scanner sc) {
        System.out.print("Digite o nome do titular: ");
        String titular = sc.next();
        System.out.print("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Digite o limite do cheque especial: ");
        double limite = sc.nextDouble();
        System.out.print("Digite a taxa de juros do empréstimo: ");
        double taxa = sc.nextDouble();

        ContaCoEmpresarial conta = new ContaCoEmpresarial(titular, saldo, limite, taxa);
        int opcao;

        do {
            System.out.println("\n--- Menu ContaCoEmpresarial ---");
            System.out.println("1. Depositar");
            System.out.println("2. Solicitar Empréstimo");
            System.out.println("3. Exibir Saldo");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Valor para depositar: ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                    System.out.println("Depósito realizado.");
                    break;
                case 2:
                    System.out.print("Valor para solicitar empréstimo: ");
                    double emprestimo = sc.nextDouble();
                    try {
                        if (!conta.solicitaEmprestimo(emprestimo)) {
                            throw new MinhasExcecoes("Empréstimo não autorizado: valor excede o limite.");
                        } else {
                            System.out.println("Empréstimo autorizado.");
                        }
                    } catch(MinhasExcecoes e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(conta.exibeSaldo());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
    }

    public static void menuContaPoEstudantil(Scanner sc) {
        System.out.print("Digite o nome do titular: ");
        String titular = sc.next();
        System.out.print("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Digite a taxa de rendimento (em %): ");
        double taxa = sc.nextDouble();
        System.out.print("Digite o limite de isenção de taxa: ");
        double limite = sc.nextDouble();

        ContaPoEstudantil conta = new ContaPoEstudantil(titular, saldo, taxa, limite);
        int opcao;

        do {
            System.out.println("\n--- Menu ContaPoEstudantil ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Exibir Saldo");
            System.out.println("4. Exibir Limite de Isenção");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Valor para depositar: ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                    System.out.println("Depósito realizado.");
                    break;
                case 2:
                    System.out.print("Valor para sacar: ");
                    double saque = sc.nextDouble();
                    try {
                        if (!conta.sacar(saque)) {
                            throw new MinhasExcecoes("Saque não realizado: saldo insuficiente.");
                        } else {
                            System.out.println("Saque realizado.");
                        }
                    } catch(MinhasExcecoes e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(conta.exibeSaldo());
                    break;
                case 4:
                    System.out.println(conta.exibeLimiteIsencao());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
    }
}
