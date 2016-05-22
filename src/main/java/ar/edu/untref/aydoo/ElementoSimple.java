package ar.edu.untref.aydoo;

public abstract class ElementoSimple implements Transformable {

    private String contenido;

    public ElementoSimple(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

}