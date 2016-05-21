package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TituloHTMLTest {

	@Test
	public void seColocaUnContenidoDeUnTituloParaPasarloATituloEnHTML(){

		TituloHTML tituloHTML = new TituloHTML("Esto es un Titulo");
		String contenidoDelTituloHTML = tituloHTML.getContenido();

		Assert.assertTrue(contenidoDelTituloHTML.equals("<h1>Esto es un Titulo</h1>"));

	}

}