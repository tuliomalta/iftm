public class ContaPoupanca implements Conta{

    private double saldo;

    public ContaPoupanca(double saldo) {
        this.saldo = saldo;
    }

    public ContaPoupanca(){}

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
         saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
