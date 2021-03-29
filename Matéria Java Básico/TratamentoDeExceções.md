# Tratamento de exceções

​	Exceções são todos os erros que ocorrem durante o processamento de um método que podem ser esperados ou não esperados. Como o termo já diz, **"Exceptions"** são exceções. Falhas que não devem ocorrer rotineiramente no fluxo de um sistema.

Exemplo de tratamento de exceção:

```java
public static void metodo() {
    try{
        new java.io.FileInputStream("arquivo.txt");
    } catch (java.io.FileNotFoundException e) {
        System.out.println("Não foi possível abrir o arquivo para leitura");
    }
}
```

Fluxo Exceptions:

<img src="D:\Cursos Dev\BootCamp Inter Java Developer\JavaBasico\Exercicios_Java\Exceptions.png" alt="Exception" style="zoom:50%;" />

**Checked Exceptions**

​	São exceções esperadas, cujo fluxo ou método de um sistema foi preparado para receber. Um bom exemplo é uma exceção de negócio, onde se deseja informar um erro caso a exceção esperada ocorra.

Exemplo de checked exception:

```java
try{
    PreparedStatement stmt = con.prepareStatement(query);
    // ...
} catch (SQLException e){
    throw new AcessoADadosException("Problema na criação do Statement", e);
}
```

**Unchecked Exceptions**

​	São excções não esperadas para o fluxo ou método de um sistema, um bom exemplo é a famosa NullPointException que ocorre quando se tenta acessar uma referência de memória vazia, ou recuperar uma instância que não existe, dentre outros motivos.

Exemplo de unchecked exception:

```java
try{
    CarroVo carro = new CarroVo();
    carro.getPlaca();
} catch (IntegrationException e){
    throw new BusinessException("Erro na criação do objeto", e);
}
```

**Bloco Try catch**

​	O bloco try catch sempre é utilizado quando no processo que será executado dentro de um método é esperado um erro, então cria-se um bloco "protegido" onde qualquer erro que ocorra dentro do treco "try" é direcionado para o trecho "catch" e sofrerá o devido tratamento de erro.

Exemplo de um bloco try/catch:

```java
try {
    PreparedStatement stmt = con.prepareStatement(query);
    // ...
} catch (SQLException e){
    throw new AcessoADadosException("Problema na criação do Statement", e);
}
```

**Finally e throw**

​	O finally é um bloco de código que pode ou não ser utilizado junto ao try catch, este trecho de código sempre será executado independente se ocorrer erro ou não dentro do fluxo onde existe o try catch. Normalmente o finally é usado para liberar recursos ou para dar continuidade em um fluxo que deve ocorrer independente de erro.

Exemplo de bloco finally:

```java
try {
    PreparedStatement stmt = con.prepareStatement(query);
    // ...
} catch (SQLException e) {
    throw new AcessoADadosException("Problema na criação do Statement", e);
} finally {
    stmt.close();
}
```

**Throw e Throws**

​	Throws: É a assinatura do método que será retornado caso ocorra erro para o método que fez a chamada, dentro de um fluxo encadeado.

​	Throw: É usado para lançar a exceção desejada, juntamente com a mensagem de erro, para o método que fez a chamada.

Exemplo de throw e throws:

```java
public String recuperarIdUsuario(String query) throws AcessoADadosException{
	try {
		PreparedStatement stmt = con.prepareStatement(query);
		// ...
	} catch (SQLException e){
		throw new AcessoADadosException("Problema na criação do Statement", e);
	} finally {
		stmt.close();
	}
}
```

