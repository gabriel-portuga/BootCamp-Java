package javaDateFormat;

import java.text.DateFormat;
import java.util.Date;
// Exemplo de formatação de data com DateFormat
public class Exemplo08 {
    public static void main(String[] args){
        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);
        // Retorna: 26/03/2021 16:56

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        // Retorna: 26 de março de 2021 16:56

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(agora);
        System.out.println(dateToStr);
        // Retorna: 26 de março de 2021 17:02:36 BRT
    }
}