package com.augusto;

public class Gerente implements FuncionarioCeletista {
    private double salarioBase;
    private double bonificacao;

    public Gerente(double salarioBase, double bonificacao) {
        this.salarioBase = salarioBase;
        this.bonificacao = bonificacao;
    }

    @Override
    public String getCargo() {
        return "Gerente";
    }

    @Override
    public double calculaSalario() {
        return salarioBase + bonificacao;
    }

    @Override
    public double calcula13o() {
        return salarioBase;
    }
}