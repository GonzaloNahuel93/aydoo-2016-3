package ar.edu.untref.aydoo.elementos;


public class ImagenHTML extends LineaHTML{

	public ImagenHTML(String contenido){
		super("<img src=\"" + contenido + "\"/>");
	}

}