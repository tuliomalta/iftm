package com.example.atividade_0804;

public class GeometriaPlana {
    private Figuras2D fig;

    public void mudaParaCirculo() {
        fig = new Circulo();
    }

    public void mudaParaTriangulo() {
        fig = new Triangulo();
    }

    public void mudaParaQuadrado() {
        fig = new Quadrado();
    }

    public void mostrarFigura() {
        if (fig != null) {
            System.out.println(fig.pegaTexto());
        } else {
            System.out.println("Nenhuma figura selecionada.");
        }
    }
}

