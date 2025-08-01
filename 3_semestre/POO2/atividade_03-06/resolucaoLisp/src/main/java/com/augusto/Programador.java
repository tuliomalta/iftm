package com.augusto;

public class Programador implements FuncionarioCeletista {
    private double salarioBase;
    private double horasExtras;

    public Programador(double salarioBase, double horasExtras) {
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    @Override
    public String getCargo() {
        return "Programador";
    }

    @Override
    public double calculaSalario() {
        return salarioBase + horasExtras;
    }

    @Override
    public double calcula13o() {
        return salarioBase;
    }
}