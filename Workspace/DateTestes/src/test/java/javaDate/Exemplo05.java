package javaDate;

import java.time.Instant;
import java.util.Date;
// Exemplo de conversão entre Date e Instant
public class Exemplo05 {
    public static void main(String[] args){
        Date dataInicio = new Date(1616692877472L);
        System.out.println(dataInicio);
        // Retorna:Thu Mar 25 14:21:17 BRT 2021

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        // Retorna: 2021-03-25T17:21:17.472Z
    }
}
