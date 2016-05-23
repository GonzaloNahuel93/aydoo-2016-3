package ar.edu.untref.aydoo;


public class Titulo extends ElementoDeLinea {

    public Titulo(String titulo) {
        super(titulo);
    }

    @Override
    public ElementoTransformadoHTML getTransformado() {

        TituloHTML tituloHTML = new TituloHTML(this.getContenido());
        return tituloHTML;

    }

    void colocarContenido(String linea) {

        this.contenido = linea.substring(1);

    }

}