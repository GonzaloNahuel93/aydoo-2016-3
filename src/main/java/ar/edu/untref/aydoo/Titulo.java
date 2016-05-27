package ar.edu.untref.aydoo.componentes;

import ar.edu.untref.aydoo.componenteshtml.ElementoTransformadoHTML;
import ar.edu.untref.aydoo.componenteshtml.TituloHTML;

public class Titulo extends ElementoDeLinea {

    public Titulo(String titulo) {
        super(titulo);
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