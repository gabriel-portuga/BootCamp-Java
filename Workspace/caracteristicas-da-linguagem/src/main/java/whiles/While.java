package whiles;

public class While {
    public static void main(String[] args){
        var x = 0;

        //Testa a condição antes de iniciar
        while (x < 1) {
            System.out.println("Denttro do while...");
            x++;
        }

        var y = 0;

        //Testa a condição depois de executar os comandos
        do {
            System.out.println("Dentro do Do/While...");
        } while (y++ < 1);
    }
}
