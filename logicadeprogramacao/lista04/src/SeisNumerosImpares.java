import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

        if (x % 2 == 0) {
            x++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(x);
            x = x + 2;
        }

    }
}

//        for (int count = 0; count < 6; x++) {
//            if (x % 2 != 0) {
//                System.out.println(x);
//                count++;
//            }
//        }