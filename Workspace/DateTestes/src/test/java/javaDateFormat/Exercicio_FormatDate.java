package javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
// Programa para formatar a data
public class Exercicio_FormatDate {
    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
        // Retorna: 26/03/2021 17:20:44.133
    }
}