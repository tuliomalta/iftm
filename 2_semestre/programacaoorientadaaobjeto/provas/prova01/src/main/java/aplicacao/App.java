package aplicacao;

import academia.Academia;
import academia.Utilitaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static final List<Aluno> alunos = new ArrayList<>();
    private static final String[][] FUNCIONARIOS = {
            {"admin1", "senha1"},
            {"admin2", "senha2"},
            {"admin3", "senha3"}
    };

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("M E N U");
            System.out.println("1- ACADEMIA");
            System.out.println("2- PERSONAL");
            System.out.println("3- SAIR");
            System.out.print("DIGITE A OPÇÃO: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    if (validarFuncionario(scanner)) {
                        subMenu(scanner);
                    }
                    break;
                case 2:
                    if (validarFuncionario(scanner)) {
                        acessarPersonal(scanner);
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static boolean validarFuncionario(Scanner scanner) {
        for (int tentativa = 0; tentativa < 3; tentativa++) {
            System.out.print("Usuário: ");
            String usuario = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            for (String[] credencial : FUNCIONARIOS) {
                if (credencial[0].equals(usuario) && credencial[1].equals(senha)) {
                    return true;
                }
            }

            System.out.println("Credenciais inválidas. Tente novamente.");
        }

        System.out.println("Número de tentativas esgotado.");
        return false;
    }

    private static void subMenu(Scanner scanner) {
        while (true) {
            System.out.println("S u b   M E N U");
            System.out.println("1- CADASTRO");
            System.out.println("2- RELATÓRIO");
            System.out.println("3- VOLTAR");
            System.out.print("DIGITE A OPÇÃO: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarAluno(scanner);
                    break;
                case 2:
                    gerarRelatorio();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void cadastrarAluno(Scanner scanner) {
        System.out.print("Código: ");
        String codigo = scanner.nextLine();

        for (Aluno aluno : alunos) {
            if (aluno.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Código já cadastrado. Tente outro código.");
                return;
            }
        }

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Aluno já cadastrado.");
                return;
            }
        }

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        if (!Utilitaria.validarTelefone(telefone)) {
            System.out.println("Telefone inválido.");
            return;
        }

        System.out.print("Categoria (1, 2 ou 3): ");
        int categoria = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        if (categoria < 1 || categoria > 3) {
            System.out.println("Categoria inválida.");
            return;
        }

        Aluno novoAluno = new Aluno(nome, telefone, categoria, codigo);
        alunos.add(novoAluno);
        Academia.atualizarContagemAlunos(1);
        System.out.println("Aluno cadastrado com sucesso.");
    }

    private static void gerarRelatorio() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println("TOTAL DE ALUNOS = " + alunos.size());
        System.out.println("ACESSOS = " + Academia.getAcessosPersonal());
    }

    private static void acessarPersonal(Scanner scanner) {
        System.out.print("Código do aluno: ");
        String codigo = scanner.nextLine();

        for (Aluno aluno : alunos) {
            if (aluno.getCodigo().equalsIgnoreCase(codigo)) {
                if (Academia.registrarAcessoPersonal(aluno)) {
                    System.out.println("Acesso ao personal registrado.");
                }
                return;
            }
        }

        System.out.println("Aluno não encontrado.");
    }
}