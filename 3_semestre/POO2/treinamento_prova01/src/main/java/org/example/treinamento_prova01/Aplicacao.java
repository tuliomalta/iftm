package org.example.treinamento_prova01;

public class Aplicacao {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Alice Silva", "123.456.789-00", 3000.00);
        Funcionario f2 = new Funcionario("Bruno Costa", "987.654.321-00", 3500.00);
        Gerente g1 = null;
        try {
            g1 = new Gerente("Carlos Lima", "111.222.333-44", 5000.00, 1500.00);
        } catch (SalarioInvalidoException e) {
            System.out.println(e.getMessage());
        }

        Departamento<Funcionario> rh = new Departamento<>("RH");
        rh.adicionarFuncionario(f1);
        if (g1 != null) rh.adicionarFuncionario(g1);

        Departamento<Funcionario> vendas = new Departamento<>("Vendas");
        vendas.adicionarFuncionario(f2);

        System.out.println(rh.listarFuncionario());
        System.out.println(vendas.listarFuncionario());
    }
}