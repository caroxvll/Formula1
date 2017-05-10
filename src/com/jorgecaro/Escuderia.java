package com.jorgecaro;

/**
 * Created by Jorge Caro on 10/05/2017.
 */
public enum  Escuderia {
    MERCEDES("mercedes", 1),
    REDBULL("red bull", 2),
    WILIAMS("williams", 3),
    FERRARI("ferrari", 4);

    private final String escuderia;
    private final int posicion;

    //Constructores


    Escuderia(String escuderia, int posicion) {
        this.escuderia = escuderia;
        this.posicion = posicion;
    }

    //Getter

    public String getEscuderia() {
        return escuderia;
    }

    public int getPosicion() {
        return posicion;
    }
}
