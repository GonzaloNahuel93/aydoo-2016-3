package ar.edu.untref.aydoo.componentes;

import ar.edu.untref.aydoo.componenteshtml.ElementoTransformadoHTML;
import ar.edu.untref.aydoo.componenteshtml.SubtituloHTML;

public class Subtitulo extends ElementoDeLinea {

	public Subtitulo(String subtitulo){
		super(subtitulo);
	}

	@Override
	public ElementoTransformadoHTML getTransformado() {

		 SubtituloHTML subtituloHTML = new SubtituloHTML(this.getContenido());
	     return subtituloHTML;

	}

    @Override
    public void colocarStringDeContenidoPropio(String contenido) {
        this.contenido = contenido.substring(3);
    }

}