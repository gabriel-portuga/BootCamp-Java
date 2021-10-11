# java.util.Set

* Implementações que aprenderemos
  * java.util.HashSet
  * java.util.TreeSet
  * java.util.LinkedHashSet
* Por padrão, não garante ordem
* Não permite itens repetidos
* Permite adição e remoção normalmente. Não possui busca por item e atualização. Para leitura, apenas navegação.
* Não permite mudança de ordenação.

|               | Quando utilizar                                              | Ordenação                                        | Performance                                                  |
| ------------- | ------------------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------------------ |
| HashSet       | Quando não é necessário manter uma ordenção                  | Não é ordenado, e não permite valores repetidos. | Por não ter repetição de valores e não ser ordenado, é a implementação mais performática |
| LinkedHashSet | Quando é necessário manter a ordem de inserção dos elementos. | Mantém a ordem de inserção dos elementos.        | É a implementação mais lenta por ser necessária manter a ordem. |
| TreeSet       | Quando é necessário alterar a ordem através do uso de comparators. | Mantém ordem e pode ser reordenado.              | E performático para leitura. Para modificação tem a necessidade de reordenar, sendo mais lento que o LinkedHashSet. |

### HashSet

```java
import java.util.HashSet;
import java.util.Interator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args){
        Set<Double> notasAlunos = new HashSet<>();
        
        // Adiciona as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);
        System.out.println(notasAlunos); // [4.0, 5.8, 10.0, 9.3, 3.8, 6.5, 7.3, 5.4]
        
        // Remove a nota do set
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos); // [4.0, 5.8, 10.0, 9.3, 6.5, 7.3, 5.4]
        
        // Retorna a quantidade de itens do set
        System.out.println(notasAlunos.size()); // 7
        
        // Navega em todos os itens do interator
        Interator<Double> interator = notasAlunos.interator();
        
        while (interator.hasNext()){
            System.out.println(interator.next());
        }
        for (Double nota: notasAlunos){
            System.out.println(nota);
        }
        notasAlunos.clear();
        
        // Retorna se o set está vazio ou não
        System.out.println(notasAlunos.isEmpty()); // true
    }
}
```

