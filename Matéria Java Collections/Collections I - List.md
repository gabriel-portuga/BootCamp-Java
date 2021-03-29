# Collections I - List

**java.util.list**

- Implementações que aprenderemos:
  - java.util.ArrayList
  - java.util.Vector
- Garante ordem de inserção
- Permite adição, atualização, leitura e remoção sem regras adicionais. Permite ordenação através de comparators.

Exemplo List:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        // Cria uma Lista do tipo String
        List<String> nomes = new ArrayList<>();

        // Adiciona nomes a lista nomes
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        // Muda o nome na posição 2 para Larissa
        nomes.set(2, "Larissa");

        // Imprimi os nomes na ordem que foi declarado
        System.out.println(nomes);

        //Ordena os nomes por ordem alfabética
        Collections.sort(nomes);
        System.out.println(nomes);

        // Podemos descobrir qual o índice de um nome na lista usando o método
        int posicao = nomes.indexOf("Carlos");
        System.out.println(posicao);// Caso o nome não exista, retornara -1

        // O metodo Remove, tem 2 formas de ser utilizado, 1 removendo a posição
        nomes.remove(4);
        System.out.println(nomes); // Foi removido o nome Maria que estava na posição 4

        // E a forma de escolher o objeto
        nomes.remove("João");
        System.out.println(nomes); // Foi removido o nome igual ao digitado no remove

        // Para retornarmos um nome para uam variavel podemos utilizar o get
        String nome = nomes.get(1);
        System.out.println(nome);

        // Para saber o tamanho da lista, podemos usar o size
        int tamanho = nomes.size();
        System.out.println(tamanho);

        // Para saber se existe ou não na lista usamos
        boolean temAnderson = nome.contains("Anderson");
        System.out.println(temAnderson); // Retorna: False

        // Para saber se a lista está vazia usamos
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia); // Retorna False pois tem nomes na lista

        // Repetição com Lista
        for (String nomeDoItem: nomes){

            System.out.println("--> " + nomeDoItem);
        }
        
        // Enquanto houver proximo, ira imprimir o valor
        Iterator<String> interator = nomes.iterator();
        while (interator.hasNext()) {
            System.out.println("-x->" + interator.next());
        }

        // Para zerar a lista, apagar todos nomes podemos utilizar o comando
        nomes.clear();
        System.out.println(nomes); // Renorta: [] vazio
    }
}
```

Exemplo de Vector:

```java
import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        //Adiciona 4 esportes no vetor
        esportes.add("Futebol");
        esportes.add("MontainBike");
        esportes.add("Handbol");
        esportes.add("Ciclismo");

        // Altera o valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");

        // Remove o esporte da posição 2
        esportes.remove(2);

        // Remove o esporte Futebol do vetor
        esportes.remove("Futebol");

        // Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        // Navega nos esportes
        for (String esporte: esportes){
            System.out.println(esporte);
        }
    }
}
```

**Exercício final**

1 -  Crie uma lista e execute as seguintes operações:

- Adicione 5 nomes: Juliana Pedro, Carlos, Larissa e João.
- Navegue na lista exibindo cada nome no console.
- Substitua o nome Carlos por Roberto.
- Retorne o nome da posição 1.
- Remova o nome da posição 4.
- Remova o nome João.
- Retorne a quantidade de itens na lista.
- Verifique se o nome Juliano existe na lista.
- Crie uma nova lista com os nomes? Ismael e Rodrigo. Adicione todos os itens da nova lista na primeira lista criada.
- Ordene os itens da lista por ordem alfabética.
- Verifique se a lista está vazia.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliano");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome: nomes){
            System.out.println("--> " + nome);
        }

        int posicaoCarlos = nomes.indexOf("Carlos");
        nomes.set(posicaoCarlos, "Roberto");

        System.out.println("Nome da posição 02 é: " + nomes.get(1));

        nomes.remove(4);

        nomes.remove("João");

        System.out.println("Temos " + (nomes.size() +1) + " nomes na lista");

        if ( nomes.indexOf("Juliano") > -1) {
            System.out.println("O nome Juliano existe na lista na posição: " + nomes.indexOf("Juliano"));
        } else {
            System.out.println("O nome Juliano não está na Lista");
        }

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        nomes.addAll(nomes2);

        Collections.sort(nomes);
        System.out.println("Os nomes em ordem alfabética são:");
        for (String nome: nomes){
            System.out.println("--> " + nome);
        }

        if (nomes.isEmpty() == true) {
            System.out.println("A lista está vazia");
        } else {
            System.out.println("A lista contem " + nomes.size() + " nomes");
        }
    }
}import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliano");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome: nomes){
            System.out.println("--> " + nome);
        }

        int posicaoCarlos = nomes.indexOf("Carlos");
        nomes.set(posicaoCarlos, "Roberto");

        System.out.println("Nome da posição 02 é: " + nomes.get(1));

        nomes.remove(4);

        nomes.remove("João");

        System.out.println("Temos " + (nomes.size() +1) + " nomes na lista");

        if (nomes.contains("Juliano")) {
            System.out.println("O nome Juliano existe na lista na posição: " + nomes.indexOf("Juliano"));
        } else {
            System.out.println("O nome Juliano não está na Lista");
        }

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        nomes.addAll(nomes2);

        Collections.sort(nomes);
        System.out.println("Os nomes em ordem alfabética são:");
        for (String nome: nomes){
            System.out.println("--> " + nome);
        }

        if (nomes.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            System.out.println("A lista contem " + nomes.size() + " nomes");
        }
    }
}
```

