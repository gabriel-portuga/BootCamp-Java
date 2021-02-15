package operadores;

public class Incremento {
    public static void main(String[] args){
        var numero = 1;

        System.out.println(++numero); // Soma + 1 antes de Imprimir a variavel
        // Podemos tbm usar numero ++ ou numero += 1

        var variavel = 10;

        System.out.println(variavel--); // Imprime a variavel e depois Diminui 1
        System.out.println(variavel);
    }
}
