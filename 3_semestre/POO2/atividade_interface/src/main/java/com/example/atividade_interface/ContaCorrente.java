public class ContaCorrente implements Conta{

    private double saldo;
    private double taxa;

    public ContaCorrente(double saldo, double taxa) {
        this.saldo = saldo;
        this.taxa = taxa;
    }

    public ContaCorrente() {}

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor + taxa <= saldo) {
            saldo -= (valor + taxa);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
