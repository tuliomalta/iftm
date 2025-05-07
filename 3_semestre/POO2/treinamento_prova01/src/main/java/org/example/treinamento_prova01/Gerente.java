package org.example.treinamento_prova01;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, String cpf, double salarioBase, double bonus) throws SalarioInvalidoException {
        super(nome, cpf, salarioBase);
        if (bonus < 0) {
            throw new SalarioInvalidoException("Bônus não pode ser negativo");
        }
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }

    @Override
    public String mostrarDados() {
        return String.format("Nome: %s CPF: %s Salário: %s", nome, cpf, Util.formatarMoeda(calcularSalario()));
    }
}