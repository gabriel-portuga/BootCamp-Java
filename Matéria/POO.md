## O paradigma O.O 

> "A diferença entre um código Procedural e um O.O é bem simples. Em códigos procedurais(...) escolher o melhor algoritmo é o mais importante(...) já em linguagens orientada a objetos(...) pensar no projeto de classes(...) como se encaixam(...) e como serão estendidas é o que mais importa." **Maurício Aniche**

- Classe
  Vamos entender uma classe como um modelo a ser seguido.
  Uma classe vai funcionar como uma espécie de molde que nos servirá como base para construir algo.

  Por exemplo. Quando pensamos em construir uma casa, nós fazemos uma planta baixa. Ela será o modelo que utilizaremos para construir algo concreto.

  As classes funcionam de forma parecida.

  ``` java
  public class Pessoa{
  	private String nome = "Gabriel";
  	public String getNome(){
  		return nome;
  	}
      public String falarMeuProprioNome() {
          return "Olá, meu nome é " + getNome();
      }
  }
  ```

- Objeto

  Agora que entendemos que temos um modelo que podemos seguir. O que podemos fazer com esse modelo?

  Bom...Nós fizemos a analogia da casa, certo? Depois de termos a planta baixa, nós começamos a construir.

  E o resultado do que nós construímos, vamos chamar de objeto.

  Quando nós utilizarmos a nossa classe Pessoa - mostrada no código anterior para criar um objeto, nós diremos que estamos instanciando um objeto da classe Pessoa.

  E esse termo é bem simples de entender. O que acontece é que podemos criar vários objetos de uma mesma classe, ou seja, várias instâncias de objetos.

  ```java
  public class ExemploPessoa {
      public static void main(String[] args){
          Pessoa pessoa = new Pessoa();
          System.out.println(pessoa.getNome());
          //Gabriel
      }
  }
  ```

* Atributos

  Agora vamos pensar no que nos definimos como **nome**. Foi tão intuitivo nós pensarmos que uma pessoa teria um nome que nem demos importância a ele. O nome é uma característica de uma *Pessoa* e pode ser diferente de pessoa para pessoa. O nome é um **atributo** da pessoa.

* Métodos

  Agora vamos pensar que uma pessoa pode ter ações. Por exemplo, uma pessoa pode falar. Pensando em um cenário mais específico, uma pessoa pode falar o seu nome. As ações que nós definimos que uma classe pode ter, nós chamamos de **métodos**.

  ```java
  public class ExemploMetodos {
      public static void main(String[] args) {
          Pessoa pessoa = new Pessoa();
          System.out.println(pessoa.falarMeuProprioNome());
          //Olá, meu nome é Gabriel
      }
  }
  ```



### Exercício final:

Crie uma classe Carro. Nessa classe você deverá ter a quantidade de pessoas que estão dentro do carro. E também é preciso que tenha uma forma de adicionar e remover pessoas de dentro do carro.

```java
package exercicioCarro;

public class Carro {
    int maximo = 5;
    int tripulantes = 0;
    int lugares = maximo;

    public Integer getLugares(){
        lugares -= tripulantes;
        return lugares;
    }
    public Integer getTripulantes(){
        return tripulantes;
    }
    public Integer getAddTripulaante(){
        tripulantes += 1;
        return tripulantes;
    }
    public Integer getSubTripulante(){
        tripulantes -= 1;
        return tripulantes;
    }
}
```

```java
package exercicioCarro;

public class Programa {
    public static void main(String[] args){
        Carro carro = new Carro();

        /*System.out.println(carro.getLugares());
        System.out.println((carro.getAddTripulaante()));
        System.out.println(carro.getTripulantes());
        System.out.println(carro.getLugares());*/

        System.out.println("O carro tem " + carro.getLugares() + " lugares");
        carro.getAddTripulaante();
        System.out.println("Adicionando 1 tripulante, o carro fica com " + carro.getTripulantes() + " tripulantes e "
                + carro.getLugares() + " lugares");
    }
}
```



