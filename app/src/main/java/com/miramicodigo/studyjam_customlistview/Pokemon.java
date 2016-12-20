package com.miramicodigo.studyjam_customlistview;

import java.io.Serializable;

/**
 * @author Gustavo Lizarraga
 * @version 1.1
 * @date 16/12/2016 - Modified: 19/12/2016
 * #DevStudyJam
 * */


public class Pokemon implements Serializable{
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
