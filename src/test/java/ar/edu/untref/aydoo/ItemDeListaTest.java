package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ItemDeListaTest {

    @Test
    public void queDosItemsIgualesSeanIguales() {

        ItemDeLista item1 = new ItemDeLista("Item");
        ItemDeLista item2 = new ItemDeLista("Item");

        Assert.assertTrue(item1.equals(item2));

    }

    @Test
    public void queDosSubtitulosDistintosSeanDistintos() {

        ItemDeLista item1 = new ItemDeLista("Item1");
        ItemDeLista item2 = new ItemDeLista("Item2");

        Assert.assertFalse(item1.equals(item2));

    }

    @Test
    public void queElContenidoDelSubtituloSeSeteeCorrectamenteAPartirDelStringQueLoRepresenta() {

        ItemDeLista item = new ItemDeLista("");
        item.colocarStringDeContenidoPropio("*item");

        Assert.assertEquals("item", item.getContenido());

    }
    
}