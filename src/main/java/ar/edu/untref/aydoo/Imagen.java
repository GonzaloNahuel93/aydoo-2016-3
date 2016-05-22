package ar.edu.untref.aydoo;

public class Imagen extends ElementoSimple {

	public Imagen(String imagen){
		super(imagen);
	}

	@Override
	public ComponenteHTML getTransformado() {

		ImagenHTML imagenHTML = new ImagenHTML(this.getContenido());
		return imagenHTML;

	}

}