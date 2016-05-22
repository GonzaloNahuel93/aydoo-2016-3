package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ListaHTMLTest {

    @Test
    public void queSeColoquenCorrectamenteVariasLineasDeTextoAUnaLista() {

        ItemDeListaHTML item1 = new ItemDeListaHTML("Primer Item");
        ItemDeListaHTML item2 = new ItemDeListaHTML("Segundo Item");
        ItemDeListaHTML item3 = new ItemDeListaHTML("Tercer Item");
        ListaHTML listaHTML = new ListaHTML();

        listaHTML.agregarItem(item1);
        listaHTML.agregarItem(item2);
        listaHTML.agregarItem(item3);
        String contenidoDeLaListaHTML = listaHTML.getContenido();

        Assert.assertEquals(("<ul>\n" +
                			 " <li>Primer Item</li>\n" +
                			 " <li>Segundo Item</li>\n" +
                			 " <li>Tercer Item</li>\n" +
                			 "</ul>"), contenidoDeLaListaHTML);

    }

}