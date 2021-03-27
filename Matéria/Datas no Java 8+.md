## Datas no Java 8+

**LocalDate** é uma classe imutável para representar uma data. Seu formato padrão é **yyy-MM-dd**

**LocalDate** exemplo10:

```java
import java.time.LocalDate;

/**
 * Exemplo de como utilizar LocalDate
 */
public class Exemplo010 {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);
        // 2019-07-14
    }
}
```

Exemplo11:

```java
import java.time.LocalDate;

/**
 * Exemplo de como manipular LocalDate
 */
public class Exemplo011 {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        // 2019-07-14

        System.out.println(ontem);
        // 2019-07-13
    }
}
```

**LocalTime** é uma classe imutável que representa um padrão de hora-minuto-segundo. **LocalTime** pode ser representado até o nível de nanosegundos. Exemplo: 12:22:10:123212345. Sua utilização é similar ao **LocalDate**.

**LocalTime** exemplo12:

```java
import java.time.LocalTime;

/**
 * Exemplo de como utilizar LocalTime
 */
public class Exemplo012 {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        // 23:53:58.421
    }
}
```

Exemplo13:

```java
import java.time.LocalTime;

/**
 * Exemplo de como manioular LocalTime
 */
public class Exemplo013 {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        // 23:53:58.421

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        // 00:55:37.421
    }
}
```



**LocalDateTime** Funciona como uma espécie de junção entre o LocalTime e o LocalDate. Também é uma classe imutável e você consegue trabalhar com dia e hora de uma só vez. Você pode manipular a data e hora com precisão de nanosegundos. Exemplo: **2nd October 2007 at 13:45:30.123456789**.

**LocalDateTime** exemplo14:

```java
import java.time.LocalDateTime;

/**
 * Exemplo de como manipular LocalDateTime
 */
public class Exemplo014 {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);
        // 2019-07-15T00:02:16.076

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
        // 2019-07-17T01:02:28.076
    }
}
```

**Exercício final**

Adicione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00.

```

```

