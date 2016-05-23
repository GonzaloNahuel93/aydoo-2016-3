package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ImagenHTMLTest {

	@Test
	public void queLaLineaEnHTMLDeUnaImagenPNGSeEscribaCorrectamente(){

		ImagenHTML imagenHTML = new ImagenHTML("AyDOO.png");
		String contenidoDeLaImagenHTML = imagenHTML.getContenido();

		Assert.assertTrue(contenidoDeLaImagenHTML.equals("<img src=\"AyDOO.png\"/>"));

	}

	@Test
	public void queUnaLineaEnHTMLDeUnaImagenJPGSeEscribaCorrectamente(){

		ImagenHTML imagenHTML = new ImagenHTML("AyDOO.jpg");
		String contenidoDeLaImagenHTML = imagenHTML.getContenido();

		Assert.assertTrue(contenidoDeLaImagenHTML.equals("<img src=\"AyDOO.jpg\"/>"));

	}

}