package list;

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