### O java.util.Calendar

Já na JDK 1.1 foi observada a necessidade de facilitar alguns recursos que a class Date oferecia. Sendo assim, a classe **Calendar** foi criada. Com isso uma série de métodos e construtores da classe Date foi depreciada. Por exemplo o construtor **Date(int year, int moth, int date)**.

**Caldendar** é uma classe abstrata que provê métodos para converter data entre um instante específico. O Calendar possui alguns campos específicos para manipulação como MONTH, YEAR, HOUR etc.

Exemplo05:

```java
import java.util.Calendar;

// Exemplo de utilização da classe Calendar
public class Exemplo05_Calendar {
    public static void main(String[] args){
        Calendar agora = Calendar.getInstance();

        System.out.println(agora);
        /*
        *java.util.GregorianCalendar[
        * time=1616775889512,areFieldsSet=true,areAllFieldsSet=true,
        * lenient=true,zone=sun.util.calendar.ZoneInfo[
        * id="America/Sao_Paulo",offset=-10800000,dstSavings=0,
        * useDaylight=false,transitions=93,lastRule=null],
        * firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,
        * YEAR=2021,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,
        * DAY_OF_YEAR=85,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,
        * HOUR=1,HOUR_OF_DAY=13,MINUTE=24,SECOND=49,MILLISECOND=512,
        * ZONE_OFFSET=-10800000,DST_OFFSET=0]
        */
    }
}
```

Exemplo06 manipulação de datas:

```java
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
```

**Imprimindo data e horas**

Aqui vão algumas maneiras de se converter o resultado de um objeto **Calendar**.

```java
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
```

### Exercício final

Um cliente tem 10 dias para pagar uma fatura após sua data de vencimento sem que os juros sejam cobrados. Caso essa data caia em um sábado ou domingo, o cliente pode pagar na segunda-feira seguinte. Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele tem para pagar.

```java
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
```

