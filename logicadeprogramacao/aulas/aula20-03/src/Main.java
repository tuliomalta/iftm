import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int entrada = s.nextInt();

//        O código com if acaba sendo inviável e nesse caso se torna melhor uso do switch
//
//        if (entrada == 1) {
//            System.out.println("Janeiro");
//        } else if (entrada == 2) {
//            System.out.println("Fevereiro");
//        } else if (entrada == 3) {
//            System.out.println("Março");
//        } else if (entrada == 4) {
//            System.out.println("Abril");
//        } else if (entrada == 5) {
//            System.out.println("Maio");
//        } else if (entrada == 6) {
//            System.out.println("Junho");
//        } else if (entrada == 7) {
//            System.out.println("Julho");
//        } else if (entrada == 8) {
//            System.out.println("Agosto");
//        } else if (entrada == 9) {
//            System.out.println("Setembro");
//        } else if (entrada == 10) {
//            System.out.println("Outubro");
//        } else if (entrada == 11) {
//            System.out.println("Novembro");
//        } else if (entrada == 12) {
//            System.out.println("Dezembro");
//        } else {
//            System.out.println("Número inválido");
//        }

        switch (entrada) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }

    }
}