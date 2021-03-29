package list;

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