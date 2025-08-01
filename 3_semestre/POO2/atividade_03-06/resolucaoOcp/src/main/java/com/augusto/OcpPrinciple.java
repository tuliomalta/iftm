package com.augusto;

public class OcpPrinciple {
    public static void main(String[] args) {
        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Remuneravel contratoEstagio = new ContratoEstagio(1500.00);
        Remuneravel contratoClt = new ContratoClt(3000.00);

        double totalEstagio = folhaPagamento.calcular(contratoEstagio);
        double totalClt = folhaPagamento.calcular(contratoClt);

        System.out.println("Total Estágio: " + totalEstagio);
        System.out.println("Total CLT: " + totalClt);
    }
}
