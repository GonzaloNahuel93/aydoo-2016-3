package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class SubtituloHTMLTest {

	@Test
	public void queLaLineaEnHTMLDeUnSubtituloSeEscribaCorrectamente(){

		SubtituloHTML subtituloHTML = new SubtituloHTML("Esto es un Subtitulo");
		String contenidoDelSubtituloHTML = subtituloHTML.getContenido();

		Assert.assertTrue(contenidoDelSubtituloHTML.equals("<h2>Esto es un Subtitulo</h2>"));

	}

	@Test
	public void queLaLineaEnHTMLDeUnSubtituloSeEscribaCorrectamenteCuandoHayUnSaltoDeLinea(){

		SubtituloHTML subtituloHTML = new SubtituloHTML("Esto es un \n" +
														"Subtitulo");
		String contenidoDelSubtituloHTML = subtituloHTML.getContenido();

		Assert.assertTrue(contenidoDelSubtituloHTML.equals("<h2>Esto es un \n" + 
														   "Subtitulo</h2>"));

	}

}