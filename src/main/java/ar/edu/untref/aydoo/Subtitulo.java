package ar.edu.untref.aydoo.elementos;

import ar.edu.untref.aydoo.TransformadoHTML;

public class Subtitulo extends ElementoDeLinea {

	public Subtitulo(String subtitulo){
		super(subtitulo);
	}

	@Override
	public TransformadoHTML getTransformado() {
		
		 SubtituloHTML subtituloHTML = new SubtituloHTML(this.getContenido());
	     return subtituloHTML;
		
	}

}