package ar.edu.untref.aydoo.Tests;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.Programa.Elementos.TituloHTML;

public class TituloHTMLTest {

	@Test
	public void queLaLineaEnHTMLDeUnTituloSeEscribaCorrectamente(){

		TituloHTML tituloHTML = new TituloHTML("Esto es un Titulo");
		String contenidoDelTituloHTML = tituloHTML.getContenido();

		Assert.assertTrue(contenidoDelTituloHTML.equals("<h1>Esto es un Titulo</h1>"));

	}

}