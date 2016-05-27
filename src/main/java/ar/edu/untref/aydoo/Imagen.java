package ar.edu.untref.aydoo;


public class Imagen extends ElementoDeLinea {

	public Imagen(String imagen){
		super(imagen);
	}

	@Override
	public ElementoTransformadoHTML getTransformado() {

		ImagenHTML imagenHTML = new ImagenHTML(this.getContenido());
		return imagenHTML;

	}

    @Override
    public void colocarStringDeContenidoPropio(String contenido) {
        this.contenido = contenido.substring(2);
    }

}