package ar.edu.untref.aydoo;

/**
 * Created by synysterlove on 23/05/16.
 */
public abstract class ElementoDefinidoPorDosCaracteresDeEspecificacion extends ElementoDeLinea {


    public ElementoDefinidoPorDosCaracteresDeEspecificacion(String contenido) {

        super(contenido);

    }

    @Override
    public void colocarStringDeContenidoPropio(String contenido) {

        this.contenido = contenido.substring(2);

    }
}
