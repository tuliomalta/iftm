import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int x = le();

        if (x < 0) {
            exibeMensagemRestricao();
        } else {
            exibirParidade(x);
        }
    }

    public static int le() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int x = scanner.nextInt();
        return x;
    }

    public static void exibeMensagemRestricao() {
        System.out.println("O número não é positivo");
    }

    public static boolean paridade(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void exibirParidade(int x) {
        if (paridade(x)) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número não é par");
        }
    }


}