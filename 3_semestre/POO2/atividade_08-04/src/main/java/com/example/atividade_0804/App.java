package com.example.atividade_0804;

public class App {
    public static void main(String[] args) {
        GeometriaPlana gp = new GeometriaPlana();

        gp.mudaParaCirculo();
        gp.mostrarFigura();

        gp.mudaParaTriangulo();
        gp.mostrarFigura();

        gp.mudaParaQuadrado();
        gp.mostrarFigura();
    }
}

