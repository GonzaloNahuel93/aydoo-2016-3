package ar.edu.untref.aydoo.tests;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.SubtituloHTML;

public class SubtituloHTMLTest {

	@Test
	public void queLaLineaEnHTMLDeUnSubtituloSeEscribaCorrectamente(){

		SubtituloHTML subtituloHTML = new SubtituloHTML("Esto es un Subtitulo");
		String contenidoDelSubtituloHTML = subtituloHTML.getContenido();

		Assert.assertTrue(contenidoDelSubtituloHTML.equals("<h2>Esto es un Subtitulo</h2>"));

	}

}