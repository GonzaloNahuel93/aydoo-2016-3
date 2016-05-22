package ar.edu.untref.aydoo.elementos;

import ar.edu.untref.aydoo.TransformadoHTML;

public class Imagen extends ElementoDeLinea {

	public Imagen(String imagen){
		super(imagen);
	}

	@Override
	public TransformadoHTML getTransformado() {

		ImagenHTML imagenHTML = new ImagenHTML(this.getContenido());
		return imagenHTML;

	}

}