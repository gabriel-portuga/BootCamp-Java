# java.text.DateFormat

Nesse ponto em que estamos existem, basicamente, duas classes para formatação de datas. O **DateFormat** e o **SimpleDateFormat**. Ambos oferecem maneiras de formatar e parsear a saída das datas.

**DateFormat** exemplo08:

```java
import java.text.DateFormat;
import java.util.Date;

public class Exemplo08 {
    public static void main(String[] args){
        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);

        System.out.println(dateToStr);
        // Retorna: 26/03/2021 16:56

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);

        System.out.println(dateToStr);
        // Retorna: 26 de março de 2021 16:56
    }
}
```

Já o **SimpleDateFormat** traz uma grande facilidade que é definir um padrão de formatação para a saída de data que você deseja.

**SimpleDateFormat** exemplo09:

```java
import java.text.SimpleDateFormat;
import java.util.Date;
// Exemplo de formatação de data com SimpleDateFormat
public class Exemplo09 {
    public static void main(String[] args){
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
        // Retorna: 26/03/2021
    }
}
```

**Exercício final**

Converta a Data atual no formato **DD/MM/YYYY HH:MM:SS:MMM**

```java
import java.text.SimpleDateFormat;
import java.util.Date;
// Programa para formatar a data
public class Exercicio_FormatDate {
    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
        // Retorna: 26/03/2021 17:20:44.133
    }
}
```

