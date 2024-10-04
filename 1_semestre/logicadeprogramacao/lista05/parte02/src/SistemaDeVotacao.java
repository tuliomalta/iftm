import java.util.Scanner;

public class SistemaDeVotacao {

    Scanner scanner = new Scanner(System.in);

    int votosCandidato1 = 0;
    int votosCandidato2 = 0;
    int votosCandidato3 = 0;
    int votosNulos = 0;
    int votosEmBranco = 0;

        while (true) {
        int voto = scanner.nextInt();

        if (voto < 0) {
            break;
        }

        switch (voto) {
            case 1:
                votosCandidato1++;
                break;
            case 2:
                votosCandidato2++;
                break;
            case 3:
                votosCandidato3++;
                break;
            case 4:
                votosNulos++;
                break;
            case 5:
                votosEmBranco++;
                break;
            default:
                break;
        }
    }

        System.out.println("Candidato 1 : " + votosCandidato1) + " voto(s)");
        System.out.println("Candidato 2 : " + votosCandidato2) + " voto(s)";
        System.out.println("Candidato 3 : " + votosCandidato3) + " voto(s)";
        System.out.println("Votos nulos : " + votosNulos) + " voto(s)";
        System.out.println("Votos em branco : " + votosEmBranco) + " voto(s)";

        scanner.close();

}
