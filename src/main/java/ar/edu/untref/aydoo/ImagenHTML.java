package ar.edu.untref.aydoo.componenteshtml;

public class ImagenHTML extends LineaHTML{

	public ImagenHTML(String contenido){
		super("<img src=\"" + contenido + "\"/>");
	}

}