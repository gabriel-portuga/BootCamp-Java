package exercicioCarro;

public class Carro {
    int maximo = 5;
    int tripulantes = 0;
    int lugares = maximo;

    public Integer getLugares(){
        lugares -= tripulantes;
        return lugares;
    }
    public Integer getTripulantes(){
        return tripulantes;
    }
    public Integer getAddTripulaante(){
        tripulantes += 1;
        return tripulantes;
    }
    public Integer getSubTripulante(){
        tripulantes -= 1;
        return tripulantes;
    }
}
