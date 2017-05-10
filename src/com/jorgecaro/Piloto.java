package com.jorgecaro;

/**
 * Created by Jorge Caro on 10/05/2017.
 */
public class Piloto {
    private int dorsal;
    private String nombre;
    private Nacionalidad nacionalidad;
    private Escuderia escuderia;
    private Tipo tipo;

    //Constructor

    public Piloto(){

    }


    public Piloto(int dorsal, String nombre, Nacionalidad nacionalidad, Escuderia escuderia, Tipo tipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.escuderia = escuderia;
        this.tipo = tipo;
    }

    //Getter y Setter


    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad.getNacionalidad() + '\'' +
                ", escuderia=" + escuderia.getEscuderia() +
                ", tipo=" + tipo.getTipo() +
                '}';
    }
}
