package ar.edu.untref.aydoo;


public class Subtitulo extends ElementoDeLinea {

	public Subtitulo(String subtitulo){
		super(subtitulo);
	}

	@Override
	public ElementoTransformadoHTML getTransformado() {
		
		 SubtituloHTML subtituloHTML = new SubtituloHTML(this.getContenido());
	     return subtituloHTML;
		
	}

}