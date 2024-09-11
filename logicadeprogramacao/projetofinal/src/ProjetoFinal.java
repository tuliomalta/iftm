import java.util.Scanner;

public class ProjetoFinal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem-vindo ao Sistema de Controle de Usuários da Telefonia!");
        System.out.println("-----------------------------------------------------------------");

        System.out.print("> Quantos usuários deseja registrar? ");
        int quantidadeUsuarios = entrada.nextInt();
        entrada.nextLine();

        String[] listaNomes = new String[quantidadeUsuarios];
        String[] listaTelefones = new String[quantidadeUsuarios];
        int[] tipoPlanos = new int[quantidadeUsuarios];
        int[] minutosUsados = new int[quantidadeUsuarios];
        double[] valorFatura = new double[quantidadeUsuarios];

        for (int i = 0; i < quantidadeUsuarios; i++) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Registro do Usuário " + (i + 1) + ":");
            System.out.print("> Nome: ");
            listaNomes[i] = entrada.nextLine();
            System.out.print("> Telefone: ");
            listaTelefones[i] = entrada.nextLine();
            System.out.print("> Tipo de Plano (0, 1 ou 2): ");
            tipoPlanos[i] = entrada.nextInt();
            System.out.print("> Minutos Utilizados: ");
            minutosUsados[i] = entrada.nextInt();
            entrada.nextLine();
        }

        System.out.println("-----------------------------------------------------------------");
        double[][] tarifas = new double[3][2];
        System.out.println("> Informe os valores de assinatura e excedente para cada tipo de plano:");
        for (int i = 0; i < 3; i++) {
            System.out.print("> Valor do Plano " + i + " (Assinatura e Minuto Excedente): ");
            tarifas[i][0] = entrada.nextDouble(); // Valor da assinatura
            tarifas[i][1] = entrada.nextDouble(); // Valor do minuto excedente
        }
        entrada.nextLine();

        int minutosInclusos = 90;
        for (int i = 0; i < quantidadeUsuarios; i++) {
            int plano = tipoPlanos[i];
            double valorPlano = tarifas[plano][0];
            double valorExcedente = tarifas[plano][1];
            int minutosExtra = Math.max(0, minutosUsados[i] - minutosInclusos);

            if (minutosUsados[i] <= minutosInclusos) {
                valorFatura[i] = valorPlano;
            } else {
                valorFatura[i] = valorPlano + (minutosExtra * valorExcedente);
            }
        }

        int escolha;
        do {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("MENU DE OPÇÕES:");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("1) Relatório de usuários");
            System.out.println("2) Receita total");
            System.out.println("3) Usuário com a fatura mais barata");
            System.out.println("4) Média de minutos utilizados por usuários tipo 1");
            System.out.println("5) Usuários que utilizaram mais de 120 minutos");
            System.out.println("6) Percentual de usuários do tipo 2");
            System.out.println("7) Imprimir tabela de usuários");
            System.out.println("8) Sair");
            System.out.println("-----------------------------------------------------------------");
            System.out.print("> Escolha uma opção: ");
            escolha = entrada.nextInt();
            entrada.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("\n> Relatório de Usuários:");
                    for (int i = 0; i < quantidadeUsuarios; i++) {
                        System.out.printf("%s, %s, Plano %d, Minutos: %d, Fatura = R$ %.2f%n",
                                listaNomes[i], listaTelefones[i], tipoPlanos[i], minutosUsados[i], valorFatura[i]);
                    }
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("\n> Receita Total:");
                    double receitaTotal = 0;
                    for (double valor : valorFatura) {
                        receitaTotal += valor;
                    }
                    System.out.printf("A receita total é R$ %.2f%n", receitaTotal);
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("\n> Usuário com a Fatura Mais Barata:");
                    int indiceMenorFatura = 0;
                    for (int i = 1; i < quantidadeUsuarios; i++) {
                        if (valorFatura[i] < valorFatura[indiceMenorFatura]) {
                            indiceMenorFatura = i;
                        }
                    }
                    System.out.printf("%s, %s%n", listaNomes[indiceMenorFatura], listaTelefones[indiceMenorFatura]);
                    System.out.println("\n");
                    break;

                case 4:
                    System.out.println("\n> Média de Minutos Utilizados por Usuários Tipo 1:");
                    int totalMinutosTipo1 = 0;
                    int quantidadeTipo1 = 0;
                    for (int i = 0; i < quantidadeUsuarios; i++) {
                        if (tipoPlanos[i] == 1) {
                            totalMinutosTipo1 += minutosUsados[i];
                            quantidadeTipo1++;
                        }
                    }
                    double mediaMinutosTipo1 = (quantidadeTipo1 > 0) ? (double) totalMinutosTipo1 / quantidadeTipo1 : 0;
                    System.out.printf("Média de minutos utilizados por usuários tipo 1: %.2f%n", mediaMinutosTipo1);
                    System.out.println("\n");
                    break;

                case 5:
                    System.out.println("\n> Usuários que Utilizaram Mais de 120 Minutos:");
                    int quantidadeAcima120 = 0;
                    for (int minutos : minutosUsados) {
                        if (minutos > 120) {
                            quantidadeAcima120++;
                        }
                    }
                    System.out.printf("Quantidade de usuários: %d%n", quantidadeAcima120);
                    System.out.println("\n");
                    break;

                case 6:
                    System.out.println("\n> Percentual de Usuários Tipo 2:");
                    int quantidadeTipo2 = 0;
                    for (int tipo : tipoPlanos) {
                        if (tipo == 2) {
                            quantidadeTipo2++;
                        }
                    }
                    double percentualTipo2 = (quantidadeUsuarios > 0) ? (double) quantidadeTipo2 / quantidadeUsuarios * 100 : 0;
                    System.out.printf("Percentual de usuários tipo 2: %.1f%%%n", percentualTipo2);
                    System.out.println("\n");
                    break;

                case 7:
                    System.out.println("\n> Tabela de Usuários:");
                    System.out.printf("%-20s %-15s %-4s %-7s %-15s%n", "Nome", "Telefone", "Plano", "Minutos", "Fatura");
                    for (int i = 0; i < quantidadeUsuarios; i++) {
                        System.out.printf("%-20s %-15s %-4d %-7d R$%-14.2f%n", listaNomes[i], listaTelefones[i],
                                tipoPlanos[i], minutosUsados[i], valorFatura[i]);
                    }
                    System.out.println("\n");
                    break;

                case 8:
                    System.out.println("\n> Fim do Programa!");
                    break;

                default:
                    System.out.println("\n> Opção inválida! Tente novamente.\n");
                    break;
            }
        } while (escolha != 8);

        entrada.close();
    }
}
