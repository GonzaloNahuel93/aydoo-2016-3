package ar.edu.untref.aydoo.componentes;

import ar.edu.untref.aydoo.componenteshtml.ElementoTransformadoHTML;
import ar.edu.untref.aydoo.componenteshtml.TextoPlanoHTML;

public class TextoPlano extends ElementoDeLinea {

    public TextoPlano(String texto) {
        super(texto);     
    }

    @Override
    public ElementoTransformadoHTML getTransformado() {

        TextoPlanoHTML texto = new TextoPlanoHTML(this.getContenido());
        return texto;

    }

    @Override
    public void colocarStringDeContenidoPropio(String contenido) {
        this.contenido = contenido;
    }

}