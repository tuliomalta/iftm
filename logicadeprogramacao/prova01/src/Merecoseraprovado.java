import java.util.Scanner;

public class Merecoseraprovado {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double nota = s.nextDouble();

        double porcentagem = (nota * 100) / 22;

        if (nota >= 0 && nota <= 22) {
            System.out.printf("Eu espero tirar %.2f%% da nota.\n", porcentagem);
        } else {
            System.out.println("Nota invalida.");
        }

        s.close();

    }
}
