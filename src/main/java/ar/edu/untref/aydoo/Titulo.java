package ar.edu.untref.aydoo.elementos;

import ar.edu.untref.aydoo.TransformadoHTML;

public class Titulo extends ElementoDeLinea {

    public Titulo(String titulo) {
        super(titulo);
    }

    @Override
    public TransformadoHTML getTransformado() {

        TituloHTML tituloHTML = new TituloHTML(this.getContenido());
        return tituloHTML;

    }

}