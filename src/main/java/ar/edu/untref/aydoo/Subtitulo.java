package ar.edu.untref.aydoo;

public class Subtitulo extends ElementoSimple {

	public Subtitulo(String subtitulo){
		super(subtitulo);
	}

	@Override
	public ComponenteHTML getTransformado() {
		
		 SubtituloHTML subtituloHTML = new SubtituloHTML(this.getContenido());
	     return subtituloHTML;
		
	}

}