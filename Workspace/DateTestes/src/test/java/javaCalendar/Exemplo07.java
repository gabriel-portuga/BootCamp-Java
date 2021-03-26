package javaCalendar;

import java.util.Calendar;

// Algumas converções de datas
public class Exemplo07 {
    public static void main(String[] args){
        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        // Retorna: sex mar 26 14:30:57 BRT 2021
        System.out.printf("%tF\n", agora);
        // Retorna: 2021-03-26
        System.out.printf("%tD\n", agora);
        // Retorna: 03/26/21
        System.out.printf("%tr\n", agora);
        // Retorna: 02:30:57 PM
        System.out.printf("%tT\n", agora);
        // Retorna: 14:30:57
    }
}
