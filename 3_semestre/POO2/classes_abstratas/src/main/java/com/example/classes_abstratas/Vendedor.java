public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    double calculaSalario() {
        return salario + (totalVendas * 0.1);
    }
}