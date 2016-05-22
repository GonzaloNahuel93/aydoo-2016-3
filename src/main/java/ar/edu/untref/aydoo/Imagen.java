package ar.edu.untref.aydoo;

public class Imagen extends Elemento{

	public Imagen(String imagen){
		super(imagen);
	}

	@Override
	public LineaHTML getTransformado() {

		ImagenHTML imagenHTML = new ImagenHTML(this.getContenido());
		return imagenHTML;

	}

}