package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávia");
        filaBanco.add("Anderson");

        System.out.println(filaBanco); // Fila em ordem de declaração

        // O método poll Remove o cliente da vez, o da cabeça e vai nos mostrar
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco); // Podemos ver que o cliente a ser atendido não está mais na fila

        /* com o método peek, retornaremos o primeiro cliente sem o retirar da fila e se não houver
        * nenhum cliente, reporta null*/
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        // Já o método Element restornará um erro se a lista estiver vazia ou fará o mesmo que o peek
        filaBanco.clear();
        String primeiroclienteOuErro = filaBanco.element();
        System.out.println(primeiroclienteOuErro);
        System.out.println(filaBanco);
    }
}
