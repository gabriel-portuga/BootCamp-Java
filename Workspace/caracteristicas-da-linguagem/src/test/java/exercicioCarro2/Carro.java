package exercicioCarro2;

public class Carro {
    String marca, modelo, variante;
    Integer ano;

    public Carro(){}

    public Carro(String marca, String modelo, Integer ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void setVariante(String variante){
        this.variante = variante;
    }
}
