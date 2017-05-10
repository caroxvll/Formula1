package com.jorgecaro;

/**
 * Created by Jorge Caro on 10/05/2017.
 */
public enum  Tipo {
    PRIMER("primer piloro"),
    SEGUNDO("segundo piloto"),
    PROBADOR("piloto probador");

    private final String tipo;

    //Constructor


    Tipo(String tipo) {
        this.tipo = tipo;
    }

    //Getter


    public String getTipo() {
        return tipo;
    }
}
