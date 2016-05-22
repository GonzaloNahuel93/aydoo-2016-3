package ar.edu.untref.aydoo.tests;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.ItemDeListaHTML;

public class ItemDeListaHTMLTest {

	@Test
	public void queLaLineaEnHTMLDeUnItemDeListaSeEscribaCorrectamente(){

		ItemDeListaHTML itemDeListaHTML = new ItemDeListaHTML("Esto es un Item de una Lista");
		String contenidoDelItemDeListaHTML = itemDeListaHTML.getContenido();

		Assert.assertTrue(contenidoDelItemDeListaHTML.equals("<li>Esto es un Item de una Lista</li>"));

	}

}