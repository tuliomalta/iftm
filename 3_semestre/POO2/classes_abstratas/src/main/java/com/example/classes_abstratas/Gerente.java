public class Gerente extends Funcionario {
    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    double calculaSalario() {
        return salario * 1.5;
    }
}