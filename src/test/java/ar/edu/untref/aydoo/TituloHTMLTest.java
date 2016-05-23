package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TituloHTMLTest {

	@Test
	public void queLaLineaEnHTMLDeUnTituloSeEscribaCorrectamente(){

		TituloHTML tituloHTML = new TituloHTML("Esto es un Titulo");
		String contenidoDelTituloHTML = tituloHTML.getContenido();

		Assert.assertTrue(contenidoDelTituloHTML.equals("<h1>Esto es un Titulo</h1>"));

	}

	@Test
	public void queLaLineaEnHTMLDeUnTituloSeEscribaCorrectamenteCuandoHayUnSaltoDeLinea(){

		TituloHTML tituloHTML = new TituloHTML("Esto es un \n" + 
											   "Titulo");
		String contenidoDelTituloHTML = tituloHTML.getContenido();

		Assert.assertTrue(contenidoDelTituloHTML.equals("<h1>Esto es un \n" + 
														"Titulo</h1>"));

	}

}