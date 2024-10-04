import java.util.Scanner;

public class SomaDeImparesConsecutivos1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        int start = x;
        int end = y;

        if (x > y) {
            start = y;
            end = x;
        }

        int soma = 0;

        for (int i = start + 1; i < end; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
