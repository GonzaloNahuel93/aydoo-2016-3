package ar.edu.untref.aydoo;

public abstract class ElementoDeLinea extends Elemento {

    protected String contenido;

    public ElementoDeLinea() {

        this.contenido = "";

    }

    public ElementoDeLinea(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public abstract void colocarStringDeContenidoPropio(String contenido);

    @Override
    public boolean equals(Object obj) {

        ElementoDeLinea elemento = (ElementoDeLinea)obj;
        if(elemento.getContenido().equals(this.getContenido())) return true;
        return false;

    }

}