package javaCalendar;

import java.util.Calendar;
import java.util.Scanner;
/*
* Um cliente tem 10 dias para pagar uma fatura após sua data de vencimento
* sem que os juros sejam cobrados. Caso essa data caia em um sábado ou
* domingo, o cliente pode pagar na segunda-feira seguinte. Crie uma
* estrutura que receba uma data de vencimento e calcule quantos dias ele
* tem para pagar.
*/
public class Exercicio_ClientePagamento {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int diaVencimento, mesVencimento, comparativo;
        // Recebe o dia de hojê
        Calendar vencimentoBoleto = Calendar.getInstance();
        // Recebe o dia de hojê para comparar com o vencimento
        Calendar hoje = Calendar.getInstance();

        // Informações coletadas para mudar o vencimento
        System.out.println("Digite o dia de vencimento[00]: ");
        diaVencimento = sc.nextInt();
        System.out.println("Digite o mês de vencimento[00]: ");
        mesVencimento = sc.nextInt();

        // Mudando o vencimento, dia e mês
        vencimentoBoleto.set(Calendar.DAY_OF_MONTH, diaVencimento);
        vencimentoBoleto.set(Calendar.MONTH, mesVencimento-1);
        // Adicionando 10 dias sem juros ao vencimento
        vencimentoBoleto.add(Calendar.DATE, 10);

        // Testando se o vencimento caiu em um sábado ou domingo
        if (vencimentoBoleto.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            vencimentoBoleto.add(Calendar.DATE, 1);
            System.out.printf("Vencimento caiu em um Domingo, modificado para: %tF\n", vencimentoBoleto);
        } else if (vencimentoBoleto.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            vencimentoBoleto.add(Calendar.DATE, 2);
            System.out.printf("Vencimento caiu em um Sábado, modificado para: %tF\n", vencimentoBoleto);
        }

        // Faz o calculo de qnts dias tem entre o vencimento e o dia de hojê
        comparativo = vencimentoBoleto.get(Calendar.DAY_OF_YEAR) - hoje.get(Calendar.DAY_OF_YEAR);

        // Testando se o boleto venceu ou não e qnts dias para pagar ou que já venceu
        if (hoje.after(vencimentoBoleto)){
            System.out.println("O boelto VENCEU! deve pagar multa sobre " + (- comparativo) + " dias de atraso");
        } else if (hoje.before(vencimentoBoleto)){
            System.out.println("Com isso você tem " + comparativo + " dias para pagar sem juros");
        }
    }
}