import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a,b;

        a = s.nextInt();
        b = s.nextInt();

        if (a>=b) {
            if (a%b==0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        } else if (b>a) {
            if (b%a==0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }

        s.close();
    }
}
