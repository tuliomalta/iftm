package academia;

import java.util.Random;
import java.util.regex.Pattern;

public class Utilitaria {

    public static String gerarCodigoAluno() {
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            codigo.append((char) (random.nextInt(26) + 'a'));
        }
        for (int i = 0; i < 2; i++) {
            codigo.append(random.nextInt(10));
        }

        return codigo.toString();
    }

    public static boolean validarTelefone(String telefone) {
        String regex = "\\(3[1-57-9]\\) 9[89][0-9]{3}-[0-9]{4}";
        return Pattern.matches(regex, telefone);
    }
}