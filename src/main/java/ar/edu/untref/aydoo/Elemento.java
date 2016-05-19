package ar.edu.untref.aydoo;

/**
 * Created by synysterlove on 19/05/16.
 */
public abstract class Elemento implements Transformable {

    private String contenido;

    public Elemento(String contenido) {

        this.contenido = contenido;

    }

    public String getContenido() {

        return contenido;

    }
}
