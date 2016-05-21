package ar.edu.untref.aydoo.Programa.Elementos;

public class ImagenHTML extends LineaHTML{

	public ImagenHTML(String contenido){
		super("<img src=\"" + contenido + "\"/>");
	}

}