package com.jorgecaro;

/**
 * Created by Jorge Caro on 10/05/2017.
 */
public enum  Nacionalidad {
    ESPAÑA("español"),
    FRANCIA("frances"),
    ALEMANIA("aleman"),
    INGLATERRA("ingles");

    private final String nacionalidad;

    //Constructor


    Nacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    //Getter

    public String getNacionalidad() {
        return nacionalidad;
    }
}
