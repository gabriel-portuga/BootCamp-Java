## Construtores

Podemos entender o termo **construtor** no sentido literal, afinal vamos <ins>__construir um objeto__</ins>. Por meio de um construtor, **criamos um objeto** baseado em uma Classe e assim o <ins>alocamos em memória</ins>. Ao criarmos um objeto dizemos que estamos instanciando um objeto.

```java
public class Pessoa {
    private String nome;
    public Pessoa(){}
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
```

```java
public class Pessoa{
    private String nome;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
```

Esse exemplo que acabamos de ver é o exemplo mais comum quando começamos a estudar construtores em Java. E para instanciar essa classe(criar um objeto dela) fazemos o seguinte:

` Pessoa pessoa = new Pessoa(); `

Elas estão instanciadas da mesma forma porem uma está declarando o construtor `public Pessoa(){}` e o outro não pois é redundante para o Java.

Quando não temos um construtor padrão (sem parâmetros) definidos em uma classe, é subentendido que temos um construtor desse tipo na classe.

**Mais cuidado! Isso sá vale quando não tiver outro construtor definido.**

Também podemos criar construtores parametrizados. Dessa forma, conseguimos definir um contrato onde sempre será obrigatório passar alguma informação na hora de instanciar a classe.

Nesse exemplo temos **dois construtores.** Um **com passagem de parâmetro e outro sem.** <ins> Isso garante que possamos instanciar das duas maneiras. </ins>

```java
public class Pessoa{
    public Pessoa(){
    } // sem passagem de parametro
    public Pessoa(String nome){
        this.nome = nome;
    } // com passagem de parametro
    private String nome;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
```

Já quando definimos nossa classe dessa forma, se tentarmos instanciar a classe sem passar algum parâmetro no construtor, tomaremos **erro em tempo de compilação.**

### Exercício final:

Crie uma classe Carro com os atributos:

1. Marca: String
2. Modelo: String
3. Ano: Integer
4. Variante: String

- Essa classe deve garantir que Modelo, Marca e Ano sempre sejam passados na hora de instanciar um objeto.