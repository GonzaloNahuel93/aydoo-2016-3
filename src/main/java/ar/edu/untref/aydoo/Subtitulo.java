package ar.edu.untref.aydoo;

public class Subtitulo extends Elemento{

	public Subtitulo(String subtitulo){
		super(subtitulo);
	}

	@Override
	public LineaHTML getTransformado() {
		
		 SubtituloHTML subtituloHTML = new SubtituloHTML(this.getContenido());
	     return subtituloHTML;
		
	}

}