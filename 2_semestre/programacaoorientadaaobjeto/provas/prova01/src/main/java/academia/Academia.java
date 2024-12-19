package academia;

import aplicacao.Aluno;

public class Academia {
    private static int contagemAlunos;
    private static int acessosPersonal;

    public Academia() {}

    public static void atualizarContagemAlunos(int incremento) {
        contagemAlunos += incremento;
    }

    public static int getContagemAlunos() {
        return contagemAlunos;
    }

    public static int getAcessosPersonal() {
        return acessosPersonal;
    }

    public static boolean registrarAcessoPersonal(Aluno aluno) {
        if (acessosPersonal >= 5) {
            System.out.println("Número máximo de acessos ao personal atingido na academia.");
            return false;
        }

        int limiteAcessos = switch (aluno.getCategoria()) {
            case 1 -> 0;
            case 2 -> 1;
            case 3 -> 2;
            default -> -1;
        };

        if (aluno.getAcessos() >= limiteAcessos) {
            System.out.println("Aluno já utilizou o limite de acessos ao personal.");
            return false;
        }

        aluno.incrementarAcessos();
        acessosPersonal++;
        return true;
    }
}