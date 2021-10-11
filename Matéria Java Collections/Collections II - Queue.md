# Collections II - Queue

**java.util.Queue**

- Implementações que aprenderemos
  - java.util.LinkedList
- Garante ordem de inserção. Permite adição, leitura e remoção considerando a regra básica de uma fila: Primeiro que entra, primeiro que sai.
- Não permite mudança de ordenação

~~~java
import java.util.Queue/
    public class ExemploLinkedList {
        public static void main(String[] args) {
            Queue<String> filaBanco = new LinkedList<>(); 
            filaBanco.add("Patrícia");
            filaBanco.add("Roberto");
            filaBanco.add("Flávio");
            filaBanco.add("Pamela");
            filaBanco.add("Anderson");
            System.out.println(filaBanco); // [Patrcía, Roberto, Flávio, Pamela, Anderson]   
        }
    }
~~~

Temos as seguintes funções:

* poll() que ele remove o elemento da cabeça da fila, retorna null se estiver vazia
* peek() ele retorna o nome da cabeça mas não o remove da fila, tbm retorna null se estiver vazia
* element() Parecido com o peek, retorna o nome da cabeça, não o remove mas se a lista estiver vazia ele retornará uma exceção "NoSuchElementExcption"

```java
import java.util.Queue/
    public class ExemploLinkedList {
        public static void main(String[] args) {
            Queue<String> filaBanco = new LinkedList<>(); 
            filaBanco.add("Patrícia");
            filaBanco.add("Roberto");
            filaBanco.add("Flávio");
            filaBanco.add("Pamela");
            filaBanco.add("Anderson");
            System.out.println(filaBanco); // [Patrcía, Roberto, Flávio, Pamela, Anderson]   
            String clienteASerAtendido = filaBanco.poll();
            System.out.println(clienteASerAtendido); // Patrícia
            System.out.println(filaBanco); // [Roberto, Flávio, Pamela, Anderson]
        }
    }
```

#### Exercício final

Crie uma fila e execute as seguinte operações:

* Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
* Navegue na fila exibindo cada nome no console.
* Retorne o primeiro item da fila, sem removê-lo.
* Retorne o primeiro item da fila, removendo o mesmo.
* Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila.
* Retorne o tamanho da lista.
* Verifique se a lista está vazia.
* Verifique se o nome Carlos está na lista.

```java

```



