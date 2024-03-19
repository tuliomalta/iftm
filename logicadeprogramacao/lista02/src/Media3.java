package lista02;

import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        float n1, n2, n3, n4, notaExame;

        n1 = s.nextFloat();
        n2 = s.nextFloat();
        n3 = s.nextFloat();
        n4 = s.nextFloat();


        float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

        if (media >= 7.0) {
            System.out.println("Aluno aprovado");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado");
        } else if (media >= 5.0 || media <= 6.9) {
            System.out.println("Aluno em exame");
        }

        notaExame = s.nextFloat();

        System.out.printf("Nota do exame: %.1f\n", notaExame);

        float novaMedia = (media + notaExame) / 2;

        if (novaMedia >= 5.0) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

        System.out.printf("Media final: %.1f\n", novaMedia);

        s.close();
    }
}
