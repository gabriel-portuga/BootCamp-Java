package exercicioCarro;

public class Programa {
    public static void main(String[] args){
        Carro carro = new Carro();

        /*System.out.println(carro.getLugares());
        System.out.println((carro.getAddTripulaante()));
        System.out.println(carro.getTripulantes());
        System.out.println(carro.getLugares());*/

        System.out.println("O carro tem " + carro.getLugares() + " lugares");
        carro.getAddTripulaante();
        System.out.println("Adicionando 1 tripulante, o carro fica com " + carro.getTripulantes() + " tripulantes e "
                + carro.getLugares() + " lugares");
    }
}
