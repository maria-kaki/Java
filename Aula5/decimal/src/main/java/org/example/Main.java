package org.example;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        double valor = 1234.56;

        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        simbolos.setDecimalSeparator('.');

        DecimalFormat formato = new DecimalFormat("#.##",simbolos);
        String valorFormatado = formato.format(valor);

        System.out.println("Valor formatado: " + valorFormatado);
    }
}