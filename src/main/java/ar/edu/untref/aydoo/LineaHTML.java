package ar.edu.untref.aydoo;

public abstract class LineaHTML implements ElementoHTML {

    protected String contenido;

    protected LineaHTML(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido(){
    	return this.contenido;
    }

    @Override
    public String concatenarContenido(String contenido) {
        return contenido += (this.getContenido() + "\n");
    }

}