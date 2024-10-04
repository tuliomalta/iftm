package lista02;

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int codigo, quantidade;

        codigo = s.nextInt();
        quantidade = s.nextInt();

        float cachorroQuente= 4.00f;
        float xSalada = 4.50f;
        float xBacon = 5.00f;
        float torradaSimples = 2.00f;
        float refrigerante = 1.50f;

        float valorTotal = 0.00f;


        if (codigo == 1) {
            valorTotal = cachorroQuente * quantidade;
        } else if (codigo == 2) {
            valorTotal = xSalada * quantidade;
        } else if (codigo == 3) {
            valorTotal = xBacon * quantidade;
        } else if (codigo == 4) {
            valorTotal = torradaSimples * quantidade;
        } else {
            valorTotal = refrigerante * quantidade;
        }

        System.out.printf("Total: R$ %.2f\n", valorTotal);

        s.close();

    }
}
