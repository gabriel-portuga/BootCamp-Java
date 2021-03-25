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

```java
import java.util.Date;
public class Exemplo001{
    public static void main(String[] args){
        Date novaData = new Date();
        System.out.println(novaData);
        //retorna: Thu Mar 25 13:14:08 BRT 2021
    }
}
```

