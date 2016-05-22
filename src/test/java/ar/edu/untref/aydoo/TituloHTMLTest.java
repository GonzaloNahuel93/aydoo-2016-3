package ar.edu.untref.aydoo.tests;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.TituloHTML;

public class TituloHTMLTest {

	@Test
	public void queLaLineaEnHTMLDeUnTituloSeEscribaCorrectamente(){

		TituloHTML tituloHTML = new TituloHTML("Esto es un Titulo");
		String contenidoDelTituloHTML = tituloHTML.getContenido();

		Assert.assertTrue(contenidoDelTituloHTML.equals("<h1>Esto es un Titulo</h1>"));

	}

}