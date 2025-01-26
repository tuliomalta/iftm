package prog5tratamento;


import java.util.InputMismatchException;
import java.util.Scanner;

class Validacao extends Exception {
    public Validacao(String mensagem) {
        super(mensagem);
    }
}

public class Prog5Tratamento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (!usuario.equals("admin") || !senha.equals("123")) {
                throw new Validacao("Usuário ou senha inválidos");
            }

            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o telefone da pessoa: ");
            String telefone = scanner.nextLine();

            if (telefone.length() != 11 || !telefone.matches("\\d+")) {
                throw new Validacao("Telefone inválido");
            }

            System.out.println("Usuário autenticado com sucesso!");
            System.out.println("Nome da pessoa: " + nome);
            System.out.println("Telefone da pessoa: " + telefone);
        } catch (Validacao e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
