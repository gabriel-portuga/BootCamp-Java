# Trabalhando com datas em JAVA

### O java.util.Date

Antes de qualquer coisa, vamos definir aqui o ponto que estamos. A implementação do java.util.Date está na JDK desde sua versão 1.0. Ou seja... É de se esperar que algumas coisas não se mostrem tão interessantes nos dias atuais, dado a sua idade.

Alguns construtores do Java Date:

```java
Date()
Date(long date)
    // Todos esses estão marcos como @Deprecated desde a versão 1.1 da JDK
Date(int year, int month, int date)
Date(int year, int month, int date, int hrs, int min)
Date(int year, int month, int date, int hrs, int min, int sec)
Date(String s)
```

### Date()

Este construtor vai alocar um objeto da classe Date e o **inicializará com o milissegundo mais próximo** do período da sua execução.

Exemplo01:

```java
import java.util.Date;
// Exemplo de utilização do construtor padrão de classe Date
public class Exemplo001{
    public static void main(String[] args){
        Date novaData = new Date();
        System.out.println(novaData);
        //retorna: Thu Mar 25 14:05:56 BRT 2021
    }
}
```

### Date(long date)

Diferente do construtor anterior, esse construtor espera que você passe os milissegundos com base padrão de tempo (epoch) que usa como referência **1 de janeiro de 1970 00:00:00.**

**o que é o Epoch?**

"*O epoch timestamp é um padrão largamente aceito para representar uma data como um inteiro 32-bits a partir do início do **Unix Epoch...***"

Vamos testar com base no **System.currentTimeMillis()**

Esse método estático vai nos retornar o milissegundo mais próximo de sua execução com base no Sistema Operacional.

Exemplo02:

```java
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

```

### Métodos úteis

|     método      |   Retorno   |                          Descrição                           |
| :-------------: | :---------: | :----------------------------------------------------------: |
|   after(Date)   |   boolean   | Checa se o objetos Data de referência é posterior ao comparado |
|  before(Date)   |   boolean   | Checa se o objeto Data de referência é anterior ao comparado |
| compareTo(Date) |     int     |                  Compara dois objetos Data                   |
|  equals(Date)   |   boolean   |                Checa se os objetos são iguais                |
|    getTime()    |    long     |               Retorna a data em milissegundos                |
|  setTime(long)  |    void     |          Define uma data com base em milissegundos           |
| from(instante)  | static Date |            Define uma data com base em um instant            |
|   toInstant()   |   Instant   |            Retorna um Instant com base em um Date            |

**After e Before**; exemplo03:

```java
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
```

**compareTo e equals**; exemplo04:

```java
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
```

**from e toInstant**

**Classe Instant** surgiu na JDK 1.8; Imutável e Thread safe; Modela um ponto instantâneo de uma linha do tempo; Indicado para gravar marcações temporais em eventos da sua aplicação.

```java
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
```

#### Exercício final

- Descubra o timeInMillis do dia que você nasceu;
- Converta em um objeto Date;
- Verifique se ele é **anterior** ou **posterior** a **15 de maio de 2010**.

```java
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
```

