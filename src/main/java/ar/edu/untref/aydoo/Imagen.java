package ar.edu.untref.aydoo;


public class Imagen extends ElementoDefinidoPorDosCaracteresDeEspecificacion {

	public Imagen(String imagen){
		super(imagen);
	}

	@Override
	public ElementoTransformadoHTML getTransformado() {

		ImagenHTML imagenHTML = new ImagenHTML(this.getContenido());
		return imagenHTML;

	}

}