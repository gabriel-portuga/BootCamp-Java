package javaDate;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
* Exercício para:
*  - Descobrir o timeInMillis do dia que você nasceu.
*  - Converter em um objeto Date.
*  - Verificar se é anterior ou posterior a 15 de maio de 2010.
*/

public class Exercicio_DataAniversario {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Infome sua data de nascimento(dd/MM/yyyy): ");
        // Recebe a data de aniversário e testa se está no formato correto
        Date dataAniversario = null;
        try {
            dataAniversario = formatador.parse(sc.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //System.out.println(dataAniversario);

        Long timeMillis = dataAniversario.getTime(); // Converte pra millis
        System.out.println("Time in Millis: " + timeMillis);

        Date aniversario = new Date(605502000000L);
        System.out.println("Seu aniversário é em: " + formatador.format(aniversario)); // Objeto data de aniversário

        // Faz o comparativo para saber se é anterior ou posterior a 2010
        Date dataComparativa = new Date(1273892400000L);
        int case1 = dataAniversario.compareTo(dataComparativa);
        int case2 = dataComparativa.compareTo(dataAniversario);

        if (case1 == 1) {
            System.out.println(formatador.format(aniversario) + " é posterior a" +
                    " 15 de maio de 2010");
        } else {
            System.out.println(formatador.format(aniversario) + " é anterior a" +
                    " 15 de maio de 2010");
        }
    }
}