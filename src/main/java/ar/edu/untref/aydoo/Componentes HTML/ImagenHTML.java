package D.ComponentesHTML;

public class ImagenHTML extends LineaHTML{

	public ImagenHTML(String contenido){
		super("<img src=\"" + contenido + "\"/>");
	}

}