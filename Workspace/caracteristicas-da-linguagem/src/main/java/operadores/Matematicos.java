package operadores;

public class Matematicos {
    public static void main(String[] args){
        System.out.println("Adição entre 0 e 1: " + (0 + 1));

        System.out.println("Subtração entre 3 e 1: " + (3 - 1));

        System.out.println("Multiplicação entre 3 e 1: " + (3 * 1));

        System.out.println("Divisão inteira entre 8 e 2: " + (8/2));

        System.out.println("Resto da divisão entre 8 e 2: " + (8%2)); // Módulo - resto da divisão

        var numero = 10;
        numero *= 2;
        System.out.println("Multiplicação de 10 por 2: " + numero);
    }
}
