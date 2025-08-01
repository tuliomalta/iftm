package com.augusto;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new Gerente(5000, 2000);
        funcionarios[1] = new Programador(4000, 500);

        Estagiario estagiario = new Estagiario(1200);
        estagiario.setInstituicaoEnsino("IFMG");
        funcionarios[2] = estagiario;

        System.out.println("=== Demonstração do Princípio de Substituição de Liskov ===");
        for (Funcionario f : funcionarios) {
            System.out.println("Cargo: " + f.getCargo());
            System.out.println("Salário: R$" + f.calculaSalario());

            if (f instanceof FuncionarioCeletista) {
                FuncionarioCeletista fc = (FuncionarioCeletista) f;
                System.out.println("13º Salário: R$" + fc.calcula13o());
            }

            if (f instanceof FuncionarioEstagiario) {
                FuncionarioEstagiario fe = (FuncionarioEstagiario) f;
                System.out.println("Instituição: " + ((Estagiario)fe).getInstituicaoEnsino());
            }

            System.out.println("-------------------");
        }
    }
}