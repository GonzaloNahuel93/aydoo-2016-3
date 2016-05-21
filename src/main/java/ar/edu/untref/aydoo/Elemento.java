package ar.edu.untref.aydoo;

import ar.edu.untref.aydoo.Transformable;

public abstract class Elemento implements Transformable {

    private String contenido;

    public Elemento(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

}