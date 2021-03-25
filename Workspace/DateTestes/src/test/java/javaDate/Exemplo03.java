package javaDate;

import java.util.Date;
// Exemplo de utilização dos metodos after e before
public class Exemplo03 {
    public static void main(String[] args){
        Date dataNoPassado = new Date(1616692877472L);
        System.out.println(dataNoPassado);
        // Retorna:Thu Mar 25 14:21:17 BRT 2021
        Date dataNoFuturo = new Date(1816692877472L);
        System.out.println(dataNoFuturo);
        // Retorna:Tue Jul 27 09:54:37 BRT 2027

        // Comparando se a dataNoPassado é posterior a dataNoFuturo
        boolean isAfter = dataNoPassado.after(dataNoFuturo);
        System.out.println(isAfter);
        // Retorna: False

        // Comparando se a dataNoPassado é anterior a dataNoFuturo
        boolean isBefore = dataNoPassado.before(dataNoFuturo);
        System.out.println(isBefore);
        // Retorna: True

    }
}
