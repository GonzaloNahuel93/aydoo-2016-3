package C.ComponentesSimples;

import D.ComponentesHTML.ImagenHTML;
import D.ComponentesHTML.LineaHTML;

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