public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaCorrente.depositar(2000);
        contaPoupanca.depositar(3000);
        contaCorrente.setTaxa(30);
        contaCorrente.sacar(500);
        contaPoupanca.sacar(1000);
        GeradorExtrato geradorExtrato = new GeradorExtrato();
        String extratoCorrente = geradorExtrato.GeradorConta(contaCorrente);
        System.out.println(extratoCorrente);
        String extratoPoupanca = geradorExtrato.GeradorConta(contaPoupanca);
        System.out.println(extratoPoupanca);
    }
}
