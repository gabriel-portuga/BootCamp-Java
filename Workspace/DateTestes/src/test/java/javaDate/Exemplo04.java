package javaDate;

import java.util.Date;
// Exemplo de utilização dos metodos compareTo e equals
public class Exemplo04 {
    public static void main(String[] args){
        Date dataNoPassado = new Date(1616692877472L);
        // Retorna:Thu Mar 25 14:21:17 BRT 2021

        Date dataNoFuturo = new Date(1816692877472L);
        // Retorna:Tue Jul 27 09:54:37 BRT 2027

        Date mesmaDataNoFuturo = new Date(1816692877472L);
        // Retorna:Tue Jul 27 09:54:37 BRT 2027

        // Comparando se as datas são iguais
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);
        System.out.println(isEquals); // Retorna True

        // Comparando uma data com a outra
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo);
        // passado -> futuro
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado);
        // futuro -> passado
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo);
        // datas equivalentes

        System.out.println(compareCase1); // Retorna:-1 (passado)
        System.out.println(compareCase2); // Retorna: 1 (Futuro)
        System.out.println(compareCase3); // Retorna: 0 (presente)
    }
}
