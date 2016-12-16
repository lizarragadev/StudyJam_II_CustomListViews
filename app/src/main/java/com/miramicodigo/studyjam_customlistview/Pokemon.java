package com.miramicodigo.studyjam_customlistview;

import java.io.Serializable;

/**
 * @author Gustavo Lizarraga
 * @version 1.0
 * @date 16/12/2016
 * #DevStudyJam
 * */

public class Pokemon {
    private String Nombre;
    private String Habilidades;
    private int Imagen;

    public Pokemon() {

    }

    public Pokemon(String nombre) {
        Nombre = nombre;
    }

    public Pokemon(String nombre, String habilidades) {
        Nombre = nombre;
        Habilidades = habilidades;
    }

    public Pokemon(String nombre, String habilidades, int imagen) {
        Nombre = nombre;
        Habilidades = habilidades;
        Imagen = imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getHabilidades() {
        return Habilidades;
    }

    public void setHabilidades(String habilidades) {
        Habilidades = habilidades;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }
}
