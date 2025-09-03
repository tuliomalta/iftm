package com.augusto;

public class ContratoClt implements Remuneravel {
    private double salario;

    public ContratoClt(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double remuneracao() {
        return salario;
    }
}
