package ar.edu.untref.aydoo;

public abstract class LineaHTML implements ComponenteHTML {

    protected String contenido;

    protected LineaHTML(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido(){
    	return (this.contenido);
    }

}