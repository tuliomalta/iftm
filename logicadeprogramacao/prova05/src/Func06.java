import java.util.Scanner;

public class Func06 {

    public static double calcularPesoIdeal(double altura, char sexo) {

        if (sexo == 'M' || sexo == 'm') {
            return (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            return (62.1 * altura) - 44.7;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        double altura = s.nextDouble();


        char sexo = s.next().charAt(0);

        double pesoIdeal = calcularPesoIdeal(altura, sexo);

        if (pesoIdeal != 0.0) {
            System.out.printf("%.2f\n", pesoIdeal);
        }

        s.close();
    }
}
