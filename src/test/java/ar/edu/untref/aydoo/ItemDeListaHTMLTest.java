package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ItemDeListaHTMLTest {

	@Test
	public void queLaLineaEnHTMLDeUnItemDeListaSeEscribaCorrectamente(){

		ItemDeListaHTML itemDeListaHTML = new ItemDeListaHTML("Esto es un Item de una Lista");
		String contenidoDelItemDeListaHTML = itemDeListaHTML.getContenido();

		Assert.assertTrue(contenidoDelItemDeListaHTML.equals("<li>Esto es un Item de una Lista</li>"));

	}

	@Test
	public void queLaLineaEnHTMLDeUnItemDeListaSeEscribaCorrectamenteCuandoHayUnSaltoDeLinea(){

		ItemDeListaHTML itemDeListaHTML = new ItemDeListaHTML("Esto es un \n" + 
															  "Item de una Lista");
		String contenidoDelItemDeListaHTML = itemDeListaHTML.getContenido();

		Assert.assertTrue(contenidoDelItemDeListaHTML.equals("<li>Esto es un \n" +
															 "Item de una Lista</li>"));

	}

}