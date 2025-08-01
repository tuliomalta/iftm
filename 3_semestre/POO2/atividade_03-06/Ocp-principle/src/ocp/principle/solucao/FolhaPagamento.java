package ocp.principle.solucao;

public class FolhaPagamento {
    protected double saldo;

    public double calcuar(Remuneravel remuneravel) {
        saldo += remuneravel.remuneracao();
        return saldo;
    }
}
