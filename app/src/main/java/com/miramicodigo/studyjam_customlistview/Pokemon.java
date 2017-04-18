package com.miramicodigo.studyjam_customlistview;

/**
 *
 * @author Gustavo Lizarraga
 * @date 18/04/2017
 *
 * */

public class Pokemon {
    private String Nombre;
    private String Tipo;
    private int Imagen;

    public Pokemon() {
    }

    public Pokemon(String nombre) {
        Nombre = nombre;
    }

    public Pokemon(String nombre, String habilidades) {
        Nombre = nombre;
        Tipo = habilidades;
    }

    public Pokemon(String nombre, String habilidades, int imagen) {
        Nombre = nombre;
        Tipo = habilidades;
        Imagen = imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getHabilidades() {
        return Tipo;
    }

    public void setHabilidades(String habilidades) {
        Tipo = habilidades;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }
}
