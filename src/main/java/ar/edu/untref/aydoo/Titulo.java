package ar.edu.untref.aydoo;


public class Titulo extends ElementoDeLinea {

    public Titulo(String titulo) {
        super(titulo);
    }

    public Titulo() {
        super();
    }

    @Override
    public ElementoTransformadoHTML getTransformado() {

        TituloHTML tituloHTML = new TituloHTML(this.getContenido());
        return tituloHTML;

    }

    @Override
    public void colocarStringDeContenidoPropio(String contenido) {
        this.contenido = contenido.substring(2);
    }

}