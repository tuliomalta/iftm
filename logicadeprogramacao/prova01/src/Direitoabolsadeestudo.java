import java.util.Scanner;

public class Direitoabolsadeestudo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double nota = s.nextDouble();
        int faltas = s.nextInt();
        double renda = s.nextDouble();

        if (nota >= 8.0 && faltas<= 10 && renda < 2000.00) {
            System.out.println("Pode receber bolsa");
        } else if (nota>= 9.5 && faltas==0) {
            System.out.println("Pode receber bolsa");
        } else {
            System.out.println("Não pode receber bolsa");
        }

        s.close();

    }
}
