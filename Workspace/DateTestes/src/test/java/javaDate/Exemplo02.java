package javaDate;

import java.util.Date;
// Exemplo de utilização do construtor com passagem de parametro em milisegundos
public class Exemplo02 {
    public static void main(String[] args){
        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);
        // restorna: 1616692877472

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
        // Retorna: Thu Mar 25 14:21:17 BRT 2021
    }
}
