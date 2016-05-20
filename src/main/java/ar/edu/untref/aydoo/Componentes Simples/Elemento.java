package C.ComponentesSimples;

import B.Transformacion.Transformable;

public abstract class Elemento implements Transformable {

    private String contenido;

    public Elemento(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

}