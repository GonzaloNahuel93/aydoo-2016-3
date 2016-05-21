package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by synysterlove on 21/05/16.
 */
public class ListaHTMLTest {

    @Test
    public void queSeColoquenCorrectamenteVariasLineasDeTextoAUnaLista() {

        ItemDeListaHTML item1 = new ItemDeListaHTML("soy el primer item");
        ItemDeListaHTML item2 = new ItemDeListaHTML("soy el segundo item");
        ItemDeListaHTML item3 = new ItemDeListaHTML("soy el tercer item");
        ListaHTML listaHTML = new ListaHTML();

        listaHTML.agregarItem(item1);
        listaHTML.agregarItem(item2);
        listaHTML.agregarItem(item3);
        String contenidoDeLaListaHTML = listaHTML.getContenido();

        Assert.assertEquals(("<ul>\n" +
                " <li>soy el primer item</li>\n" +
                " <li>soy el segundo item</li>\n" +
                " <li>soy el tercer item</li>\n" +
                "</ul>"), contenidoDeLaListaHTML);

    }

    /*
    @Test(expected=Exception.class)
    public void queNoPuedaMeterUnTituloDentroDeUnaLista() {

        ItemDeListaHTML item1 = new ItemDeListaHTML("soy el primer item");
        TituloHTML titulo = new TituloHTML("soy un titulo");
        ListaHTML listaHTML = new ListaHTML();

        listaHTML.agregarComponente(item1);
        listaHTML.agregarComponente(titulo);

    }
    */

}
