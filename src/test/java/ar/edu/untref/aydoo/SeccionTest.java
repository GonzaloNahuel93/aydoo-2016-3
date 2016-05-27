package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by synysterlove on 26/05/16.
 */
public class SeccionTest {

    @Test
    public void queDosSeccionesIgualesSeanIguales() {

        Seccion seccion1 = new Seccion();
        Seccion seccion2 = new Seccion();

        Titulo titulo = new Titulo("Titulo");
        ItemDeLista item1 = new ItemDeLista("Item1");
        ItemDeLista item2 = new ItemDeLista("Item2");
        Lista lista = new Lista();
        lista.agregarItem(item1);
        lista.agregarItem(item2);
        Subtitulo subtitulo = new Subtitulo("Subtitulo");

        seccion1.agregarContenido(titulo);
        seccion1.agregarContenido(lista);
        seccion1.agregarContenido(subtitulo);
        seccion2.agregarContenido(titulo);
        seccion2.agregarContenido(lista);
        seccion2.agregarContenido(subtitulo);

        Assert.assertEquals(seccion1, seccion2);

    }


    @Test
    public void queDosListasConDistintosElementosSeanDistintas() {

        Seccion seccion1 = new Seccion();
        Seccion seccion2 = new Seccion();

        Titulo titulo = new Titulo("Titulo");
        ItemDeLista item1 = new ItemDeLista("Item1");
        ItemDeLista item2 = new ItemDeLista("Item2");
        Lista lista = new Lista();
        lista.agregarItem(item1);
        lista.agregarItem(item2);
        Subtitulo subtitulo = new Subtitulo("Subtitulo");

        Subtitulo subtitulo2 = new Subtitulo("Subtitulo2");

        seccion1.agregarContenido(titulo);
        seccion1.agregarContenido(lista);
        seccion1.agregarContenido(subtitulo);
        seccion2.agregarContenido(titulo);
        seccion2.agregarContenido(lista);
        seccion2.agregarContenido(subtitulo2);

        Assert.assertNotEquals(seccion1, seccion2);

    }
    
}
