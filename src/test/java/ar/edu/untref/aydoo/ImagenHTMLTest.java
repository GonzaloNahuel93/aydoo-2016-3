package ar.edu.untref.aydoo.Tests;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.Programa.Elementos.ImagenHTML;

public class ImagenHTMLTest {

	@Test
	public void queLaLineaEnHTMLDeUnaImagenSeEscribaCorrectamente(){

		ImagenHTML imagenHTML = new ImagenHTML("Imagen.png");
		String contenidoDeLaImagenHTML = imagenHTML.getContenido();

		Assert.assertTrue(contenidoDeLaImagenHTML.equals("<img src=\"Imagen.png\"/>"));

	}

}