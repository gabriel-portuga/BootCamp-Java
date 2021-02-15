package exercicioCarro2;

public class Programa {
    public static void main(String[] args){
        Carro carro1 = new Carro("Gol", "Volkswagen", 2016);
        carro1.setVariante("G5");
        System.out.println(String.format("Ano: %s, Modelo: %s, Variante: %s e Marca: %s",
                carro1.ano, carro1.modelo, carro1.variante, carro1.marca));
    }
}
