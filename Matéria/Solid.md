## O que é SOLID?

​	SOLID é um acrônimo dos princípios da programação orientada a objetos descritos por Robert C. Martin ("Uncle Bob").

​	Auxiliam o programador a escrever **códigos** mais **limpos, facilitando** a **refatoração** e estimulando o **reaproveitamento do código**.

### SRP - Single Responsibility Principle

"*A class should have one, and only, reason to change.*"

​	Uma classe deve ter um, e somente um, motivo para mudar.

- A classe deve possuir **uma única responsabilidade** dentro do software.

Exemplo: Class GOD (Errado)

```java
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeCompra{
    private List<Produto> produtos = new ArrayList<>();
    public void adicionarProduto(Produto produto){produtos.add(produto);}
    public void removerProduto(Produto produto){produtos.remove(produto);}
    public BigDecimal calcularTotal(){
        return produtos.stream()
            .map(Produto::getValor)
            .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
    public List<OrdemDeCompra> buscarOrdensDeCompra(){
        //retorna a lista de ordens de compra da base de dados
        return new ArrayList<>();
    }
    public void salvarOrdemCompra(){
        //salva lista de produtos na base de dados
    }
    public void enviarEmail(String email){
        //envia email da ordem de compra
    }
    public void imprimirOrdemDeCompra(){
        //imprime a ordem de compra
    }
}
```

**Seguindo o principio de SRP, deveríamos ter um arquivo para cada classe.**

```java
//CLASSE OrdemDeCompra
public class OrdemDeCompra{
    private List<Produto> produtos = new ArrayList<>();
    public void adicionarProduto(Produto produto){produtos.add(produto);}
    public void removerProduto(Produto produto){produtos.remover(produto);}
    public BigDecimal calcularTotal(){
        return produtos.stream()
            .map(Produto::getValor)
            .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
```

```java
//Classe OrdemDeCompraRepository
class OrdemDeCompraRepository{
	public List<OrdemDeCompra> buscarOrdensDeCompra(){
	//retorna a lista de ordens de compra da base de dados
	return new ArrayList<>();
	}
	public void salvarOrdemCompra(OrdemDeCompra ordemDeCompra){
	//salva lista de produtos na base de dados
	}
}
```

```java
//CLASSE OrdemDeCompraMail
class OrdemDeCompraMail {
    public void enviarEmail(OrdemDeCompra ordemDeCompra, String email){
        //envia email da ordem de compra
    }
}
```

```java
//CLASSE OrdemDeCompraPrint
class OrdemDeCompraPrint{
    public void imprimirOrdemDeCompra(OrdemDeCompra ordemDeCompra){
        //Imprime a ordem de compra
    }
}
```

### **OCP - Open Closed Principle**

*"You should be able to extend a classes behavior, without modifying it.*"

​	Você deve poder estender um comportamento de classe, sem modificá-lo.

- Objetos devem estar **abertos para extensão**, mas **fechados para modificação**.
- Quando novos comportamentos precisam ser adicionados no software, **devemos estender e não alterar o código fonte original**.

Exemplo errado pois se precisarmos adicionar outra classe, teremos que alterar a orignal:

```java
public class DescontoLivroInfantil{
    public double valorDescontoLivroInfantil(){
        return 0.3;
    }
}
```

```java
public class ControladorDeDesconto {
    public void adicionaDescontoLivroInfantil(DescontoLivroInfantil descontoLivroInfantil){
        descontoLivroInfantil.valorDescontoLivroInfantil();
    }
    public void adicionarDescontoLivroAutoAjuda(DescontoLivroAutoAjuda descontoLivroAutoAjuda){
        descontoLivroAutoAjuda.valorDescontoAutoAjuda();
    }
}
```

**Seguindo o princípio OCP**

```java
//Desconto livro
public Interface DescontoLivro{
    double valorDesconto();
}
```

```java
// DescontoLivroAutoAjuda
public class DescontoLivroAutoAjuda implements DescontoLivros{
    @Override
    public double valorDesconto(){return 0,5;}
}
```

```java
// DescontoLivroInfantil
public class DescontoLivroInfantil implements DescontoLivros {
    @override
    public double valorDesconto(){return 0.3;}
}
```

### **LSP - Liskov Substitution Princciple**

"*Derived classes must be substitutable for their base classes.*"

​	Classes derivadas devem ser substituíveis por suas classes base.

- O princípo da substituição de Liskov foi introduzido por barbara Liskov em 1987:

  "*Se para cada objeto **o1** do **tipo S** há um objeto **o2** do **tipo T** de forma que, para todos os **programas P**, o comportamento de **P** é inalterado quando **o1** é substituído por **o2**, então **S é um subtipo de T.***"

Exemplo com erro:

```java
public class Retangulo {
    private double altura;
    private double largura;
    
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
         this.altura = altura;
    }
     public double getLargura(){
         return largura;
     }
    public void setLargura(double largura){
        this.largura = largura;
    }
    public double getArea(){return altura*largura;}
}
```

```java
public class Quadrado extends Retandulo {
    @Override
    public void setAltura(double altura){
        super.setAltura(altura);
        super.setLargura(altura);
    }
    @Override
    public void setLargura(double largura){
        super.setLargura(largura);
        super.setAltura(largura);
    }
}
```

```java
public class Main{
    public static void main(String[] args){
        Retangulo retangulo = new Quadrado();
        
        retangulo.setAltura(10);
        retangulo.setLargura(5);
        System.out.println("Area: " + retangulo.getArea()); // retorna 25 - valor errado
    }
}
```

### **ISP - Interface Segregation Principle**

"*Make fine grained interfaces that are client specific.*"

​	Faça interfaces refinadas que são específicas do cliente.

- Uma classe **não deve** ser forçada a **implementar** interfaces e **métodos** que **não serão utilizados**.
- É melhor criar **interfaces** mais específicas ao **invés de** termos uma única **interface genérica**.

Exemplo:

```java
public interface Ave {
    void bicar();
    void chocarOvos();
    void voar();
}
```

```java
public class Pato implements Ave{
    @Override
    public boid bicar(){
        //consegue bicar
    }
    @Override
    public void chocarOvos(){
        //consegue por ovos
    }
    @Override
    public void voar(){
        //consegue voar
    }
}
```

```java
public class Pinguim implements Ave{
    @Override
    public void bicar(){
        //consegue bicar
    }
    @Override
    public void chocarOvos(){
        //consegue por ovos
    }
    @Override
    public void voar(){
        //NÃO consegue voar*** violando assim o princípio
    }
}
```

**Como podemos corrigir o problema de herdar coisas desnecessárias ?**

```java
public interface Ave {
    void bicar();
    void chocarOvos();
}
```

```java
public interface AvesVoam extends Ave {
    void voar();
}
```

```java
public class Pato implements AvesVoam{
    @Override
    public boid bicar(){
        //consegue bicar
    }
    @Override
    public void chocarOvos(){
        //consegue por ovos
    }
    @Override
    public void voar(){
        //consegue voar
    }
}
```

```java
public class Pinguim implements Ave{
    @Override
    public void bicar(){
        //consegue bicar
    }
    @Override
    public void chocarOvos(){
        //consegue por ovos
    }
}
```

### **DIP - Dependency Inversion Principle**

