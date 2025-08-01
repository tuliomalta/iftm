package ocp.principle.solucao;

public class ContratoCLT implements Remuneravel {
    private double salario;

    public ContratoCLT(double salario) {
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