package ar.edu.untref.aydoo;

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