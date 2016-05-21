package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class SubtituloHTMLTest {

	@Test
	public void seColocaUnContenidoDeUnSubtituloParaPasarloASubtituloEnHTML(){

		SubtituloHTML subtituloHTML = new SubtituloHTML("Esto es un Subtitulo");
		String contenidoDelSubtituloHTML = subtituloHTML.getContenido();

		Assert.assertTrue(contenidoDelSubtituloHTML.equals("<h2>Esto es un Subtitulo</h2>"));

	}

}