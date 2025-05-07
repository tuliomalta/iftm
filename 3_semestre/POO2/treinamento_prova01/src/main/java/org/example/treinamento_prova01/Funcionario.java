package org.example.treinamento_prova01;

public class Funcionario extends Pessoa implements Pagavel {
    protected double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    public double calcularSalario(double bonus) {
        return salarioBase + bonus;
    }

    @Override
    public String mostrarDados() {
        return String.format("Nome: %s CPF: %s Salário: %s", nome, cpf, Util.formatarMoeda(salarioBase));
    }
}
