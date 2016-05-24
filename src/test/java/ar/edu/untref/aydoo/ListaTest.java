package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by synysterlove on 24/05/16.
 */
public class ListaTest {

    @Test
    public void queDosListasIgualesSeanIguales() {

        Lista lista1 = new Lista();
        Lista lista2 = new Lista();

        ItemDeLista item11 = new ItemDeLista("Item1");
        ItemDeLista item12 = new ItemDeLista("Item2");
        ItemDeLista item21 = new ItemDeLista("Item1");
        ItemDeLista item22 = new ItemDeLista("Item2");

        lista1.agregarItem(item11);
        lista1.agregarItem(item12);
        lista2.agregarItem(item21);
        lista2.agregarItem(item22);

        Assert.assertTrue(lista1.equals(lista2));

    }

    @Test
    public void queDosListasIgualesSeanIgualesTomandolasComoTransformables() {

        Transformable lista1 = new Lista();
        Transformable lista2 = new Lista();

        ItemDeLista item11 = new ItemDeLista("Item1");
        ItemDeLista item12 = new ItemDeLista("Item2");
        ItemDeLista item21 = new ItemDeLista("Item1");
        ItemDeLista item22 = new ItemDeLista("Item2");

        ((Lista)lista1).agregarItem(item11);
        ((Lista)lista1).agregarItem(item12);
        ((Lista)lista2).agregarItem(item21);
        ((Lista)lista2).agregarItem(item22);

        Assert.assertTrue(lista1.equals(lista2));

    }

    @Test
    public void queDosListasDistintasSeanDistintas() {

        Lista lista1 = new Lista();
        Lista lista2 = new Lista();

        ItemDeLista item11 = new ItemDeLista("Item11");
        ItemDeLista item12 = new ItemDeLista("Item12");
        ItemDeLista item21 = new ItemDeLista("Item21");
        ItemDeLista item22 = new ItemDeLista("Item22");

        lista1.agregarItem(item11);
        lista1.agregarItem(item12);
        lista2.agregarItem(item21);
        lista2.agregarItem(item22);

        Assert.assertFalse(lista1.equals(lista2));

    }

    /*todo: falta codear lo que va a hacer andar este test
    @Test
    public void queElContenidoDeLaListaSeSeteeCorrectamenteAPartirDelStringQueLoRepresenta() {

        Imagen imagen = new Imagen("");
        imagen.colocarStringDeContenidoPropio("i:imagen.png");

        Assert.assertEquals("imagen.png", imagen.getContenido());

    }*/
    
}
