package javaCalendar;

import java.util.Calendar;

// Exemplo de utilização da classe Calendar
public class Exemplo06 {
    public static void main(String[] args){
        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é: " + agora.getTime());
        // Retorna: A data corrente é: Fri Mar 26 14:08:40 BRT 2021

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());
        // Retorna: 15 dias atrás: Thu Mar 11 14:08:40 BRT 2021

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());
        // Retorna: 4 meses depois: Sun Jul 11 14:08:40 BRT 2021

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        // Retorna: 2 anos depois: Tue Jul 11 14:08:40 BRT 2023
    }

}
