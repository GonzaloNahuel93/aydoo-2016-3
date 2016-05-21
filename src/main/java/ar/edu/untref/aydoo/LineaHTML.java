package ar.edu.untref.aydoo.Programa.Elementos;

public abstract class LineaHTML implements ComponenteHTML {

    protected String contenido;

    protected LineaHTML(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido(){
    	return (this.contenido);
    }

    public String concatenarContenido(String contenido) {
        return contenido += (" " + this.getContenido() + "\n");
    }

}