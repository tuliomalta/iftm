import java.util.Scanner;

public class JogoDaVelha {
    private static char[][] tabuleiro = new char[3][3];

    public JogoDaVelha() {
        inicializarTabuleiro();
    }

    private void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    public int interfaceTabuleiro(int jogador) {
        exibirTabuleiro();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jogador " + jogador + " (" + (jogador == 1 ? 'X' : 'O') + "), faça sua jogada (1-9): ");
        return scanner.nextInt();
    }

    private void exibirTabuleiro() {
        System.out.println("Tabuleiro atual:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char posicao = tabuleiro[i][j] != ' ' ? tabuleiro[i][j] : (char) ('1' + i * 3 + j); // Mostra 1 a 9
                System.out.print(" " + posicao + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---");
        }
    }

    public boolean validacao(int jogada) {
        int linha = (jogada - 1) / 3;
        int coluna = (jogada - 1) % 3;
        return jogada >= 1 && jogada <= 9 && tabuleiro[linha][coluna] == ' ';
    }

    public void restricao() {
        System.out.println("Jogada inválida! Tente novamente.");
    }

    public boolean empate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false; // Ainda há espaços vazios
                }
            }
        }
        return true;
    }

    public boolean vitoria(char jogador) {
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                    (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }
        if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
                (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
            return true;
        }
        return false;
    }

    public void exibeFim(int jogador) {
        if (jogador == 0) {
            System.out.println("Deu velha! O jogo empatou.");
        } else {
            System.out.println("Jogador " + jogador + " venceu!");
        }
    }

    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        int jogadorAtual = 1;
        boolean jogoAtivo = true;

        while (jogoAtivo) {
            int jogada = jogo.interfaceTabuleiro(jogadorAtual);

            if (!jogo.validacao(jogada)) {
                jogo.restricao();
                continue;
            }

            int linha = (jogada - 1) / 3;
            int coluna = (jogada - 1) % 3;
            tabuleiro[linha][coluna] = (jogadorAtual == 1) ? 'X' : 'O';

            if (jogo.vitoria((jogadorAtual == 1) ? 'X' : 'O')) {
                jogo.exibeFim(jogadorAtual);
                jogoAtivo = false;
                break;
            }

            if (jogo.empate()) {
                jogo.exibeFim(0);
                jogoAtivo = false;
                break;
            }

            jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
        }
    }
}
