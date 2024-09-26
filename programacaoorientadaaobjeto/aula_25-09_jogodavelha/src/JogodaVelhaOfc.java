import java.util.Scanner;

public class JogodaVelhaOfc {
    public static void main(String[] args) {
       char[][] jogoDaVelha = new char[3][3];

        jogoDaVelha[0][0] = ' ';
        jogoDaVelha[0][1] = ' ';
        jogoDaVelha[0][2] = ' ';
        jogoDaVelha[1][0] = ' ';
        jogoDaVelha[1][1] = ' ';
        jogoDaVelha[1][2] = ' ';
        jogoDaVelha[2][0] = ' ';
        jogoDaVelha[2][1] = ' ';
        jogoDaVelha[2][2] = ' ';
    }

    public static int interfaceTabuleiro(int jogadorAtual) {
        System.out.println("Jogador " + jogadorAtual + ", é a sua vez.");
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 7 | 8 | 9 ");
        System.out.print("Digite a posição desejada: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static boolean validacao (int posicao) {

    }

    public static void restricao() {
        System.out.println("Posição inválida! Tente novamente.");
    }
}
