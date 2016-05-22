package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class SeccionHTMLTest {

	@Test
	public void queSeColoquenCorrectamenteVariosComponentesSimplesAUnaSeccion(){

		TituloHTML tituloHTML = new TituloHTML("Analisis y Diseno Orientado a Objetos");
		SubtituloHTML subtituloHTML = new SubtituloHTML("Trabajo Practico Numero 1");
		ImagenHTML imagenHTML = new ImagenHTML("Imagen.png");
		SeccionHTML seccionHTML = new SeccionHTML();

		seccionHTML.agregarElemento(tituloHTML);
		seccionHTML.agregarElemento(subtituloHTML);
		seccionHTML.agregarElemento(imagenHTML);
		String contenidoDeLaSeccionHTML = seccionHTML.getContenido();

		Assert.assertEquals(("<section>\n" +
                             " <h1>Analisis y Diseno Orientado a Objetos</h1>\n" +
                             " <h2>Trabajo Practico Numero 1</h2>\n" +
                             " <img src=\"Imagen.png\"/>\n" +
                             "</section>\n"), contenidoDeLaSeccionHTML);

	}

    @Test
    public void queSeColoqueCorrectamenteUnaListaAUnaSeccion(){

        ListaHTML listaHTML = new ListaHTML();
        ItemDeListaHTML item1 = new ItemDeListaHTML("item1");
        ItemDeListaHTML item2 = new ItemDeListaHTML("item2");
        listaHTML.agregarItem(item1);
        listaHTML.agregarItem(item2);
        SeccionHTML seccionHTML = new SeccionHTML();

        seccionHTML.agregarElemento(listaHTML);
        String contenidoDeLaSeccionHTML = seccionHTML.getContenido();

        Assert.assertEquals(("<section>\n" +
                "<ul>\n" +
                " <li>item1</li>\n" +
                " <li>item2</li>\n" +
                "</ul>\n" +
                "</section>\n"), contenidoDeLaSeccionHTML);

    }
	
}