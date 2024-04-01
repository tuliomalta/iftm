import java.util.Scanner;

public class Tempodejogo {
    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
    
            int duracaoJogo;
    
            int horaInicio = s.nextInt();
            int horaFim = s.nextInt();
    
            if (horaInicio == horaFim) {
                duracaoJogo = 24;
            } else if (horaInicio < horaFim) {
                duracaoJogo = horaFim - horaInicio;
            } else {
                duracaoJogo = (24 - horaInicio) + horaFim;
            }
    
            System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");
            
            s.close();
    }
}
