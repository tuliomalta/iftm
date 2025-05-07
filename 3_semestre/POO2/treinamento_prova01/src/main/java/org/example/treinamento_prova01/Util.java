package org.example.treinamento_prova01;

import java.text.NumberFormat;
import java.util.Locale;

public class Util {
    public static String formatarMoeda(double valor) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return nf.format(valor);
    }
}
