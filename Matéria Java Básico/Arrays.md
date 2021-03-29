# Trabalhando com Arrays

Array ou Matriz, é uma estrutura de dados que nos permite organizar valores na memória. Fazem parte da biblioteca java.util que é nativa do Java. Armazenam elementos do mesmo tipo. Podem ser unidimensionais ou multidimensionais.

A diferença entre uma **array** para uma **lista** é que no array os elementos declarados tem que obrigatoriamente ser do mesmo tipo, já na lista não.

Cada item em um array é chamado de elemento. Cada elementos é acessado pela posição numérica(índice). O índice inicia apartir de 0. Ao se declarar um array, todos índices são inicializados em 0.

Arrays não podem mudar de tamanho, a partir do momento que uma array foi criada, ela não pode mudar de tamanho. Se você precisar de mais espaço, será necessário criar uma nova array e, antes de se referir ela, copie os elementos da array velha.

### Declaração de Arrays

Utilizando o operador "new":

```java
dataType[] arrayName = new dataType[arraySize];
int meuArray = new int[7];
```

Outra forma:

```java
dataType[] arrayName = {value0, value1, ..., valueN};
int[] meuArray = {12,32,54,6,8,89,64};
```

Para alterar o valor de um elemento específico, coloque o índice desse elemento. 

`` meuArray[0] = 50; `` 

### Comprimento do array

Para descobrir quantos elementos um array possui, use a propriedade length.

`` System.out.println(meuArray.length);``

### Percorrendo arrays

Para processar um array, devemos usar um laço de repetição (for, for each, etc). Vamos utilizar o for ocmo exemplo. Utilizamos uma variável de controle (contador), que vai de 0 até o número de posições do array.

```java
public class MyClass {
	public static void main(String[] args){
        int[] meuArray = {12,32,54,6,8,89,64};
        for(int i=0; i<7; i++){
            Sytem.out.println(meuArray[i]);
        }
    }
}
```

### Arrays multidimensionais

Um arrays multidimensional é um array contendo um ou mais arrays internos. Exemplo de array bidimensional:

``int[][] meuArrayMulti = {{1,2,3,4}, {5,6,7}};``

meuArrayMulti é um array com dois arrays como seus elementos.

Processando um array multidimensional:

```java
public class MyClass{
    public static void main(String[] args){
        int[][] meuArrayMulti = {{1,2,3,4}, {5,6,7}};
        for (int i =0; i<meuArrayMulti.length; ++i){
            for (int j=0; j<meuArrayMulti[i].length; ++j){
                System.out.println(meuArrayMulti[i][j]);
            }
        }
}
```

Testes:

```java
public class TestandoArrays {
    public static void main(String[] args){
        //Conceitos e declarações de arrays
        int[] meuArray = new int[7];
        int[] meuArray2 = {12, 32, 54, 6, 8, 89, 64};

        System.out.println(meuArray);
        // Retorna:[I@2d363fb3 (valor alocado na memória)
        System.out.println(meuArray2);
        // Retorna: [I@7d6f77cc (valor alocado na memória)

        //Alterando o valor de um elemento
        meuArray2[2] = 10;

        System.out.println(meuArray2);
        // Retorna: [I@7d6f77cc (valor alocado  na memória)

        //Comprimento do array
        System.out.println(meuArray.length);
        // Retorna: 7


        // Para imprimir o conteúdo do Array devemos indicar o índice
        System.out.println(meuArray[1]);
        // Retorna: 0 (todos são zero pois só foi declarado o tamanho)
        System.out.println(meuArray2[3]);
        // Retorna: 6

        //Alterando o valor de um elemento
        meuArray2[2] = 10;

        System.out.println(meuArray2[2]);
        // Retorna: 10
    }
}
```

