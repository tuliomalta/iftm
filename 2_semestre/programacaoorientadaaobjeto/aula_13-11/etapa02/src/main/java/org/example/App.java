package org.example;


import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String primeiraOpcao;

        do {
            double x1 = leCoordenada(1);
            double y1 = leCoordenada(2);
            double x2 = leCoordenada(3);
            double y2 = leCoordenada(4);

            scanner.nextLine();

            if (valida(x1, y1, x2, y2)) {
                Retas r = new Retas(x1, y1, x2, y2);
                System.out.println(r.exibe());
            } else {
                System.out.println("Reta não pode ser calculada");
            }

            System.out.println("Digite sim para calcular outra reta ou não para encerrar.");
            primeiraOpcao = scanner.nextLine();
        } while (primeiraOpcao.equalsIgnoreCase("sim"));
    }

    public static boolean valida(double x1, double y1, double x2, double y2) {
        if (x1 == x2 && y1 == y2) {
            return false;
        } else {
            return true;
        }
    }

    public static double leCoordenada(int coordenada) {
        if (coordenada == 1) {
            return scanner.nextDouble();
        } else if (coordenada == 2) {
            return scanner.nextDouble();
        } else if (coordenada == 3) {
            return scanner.nextDouble();
        } else {
            return scanner.nextDouble();
        }
    }
}