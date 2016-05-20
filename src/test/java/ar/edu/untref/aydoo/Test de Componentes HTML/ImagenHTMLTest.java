package D.ComponentesHTML;

import org.junit.Assert;
import org.junit.Test;

public class ImagenHTMLTest {

	@Test
	public void seColocaUnContenidoDeUnaImagenParaPasarlaAImagenEnHTML(){

		ImagenHTML imagenHTML = new ImagenHTML("Imagen.png");
		String contenidoDeLaImagenHTML = imagenHTML.getContenido();

		Assert.assertTrue(contenidoDeLaImagenHTML.equals("<img src=\"Imagen.png\"/>"));

	}

}