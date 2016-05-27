package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by synysterlove on 26/05/16.
 */
public class EstructuraDeSeccionesTest {

    @Test
    public void queDosEstructurasIgualesSeanIguales() {

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

        EstructuraDeSecciones estructura1 = new EstructuraDeSecciones();
        EstructuraDeSecciones estructura2 = new EstructuraDeSecciones();

        estructura1.agregarComponente(seccion1);
        estructura1.agregarComponente(seccion2);
        estructura2.agregarComponente(seccion1);
        estructura2.agregarComponente(seccion2);

        Assert.assertEquals(estructura1, estructura2);

    }


    @Test
    public void queDosEstructurasConSeccionesDistintasSeanDistintas() {

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

        EstructuraDeSecciones estructura1 = new EstructuraDeSecciones();
        EstructuraDeSecciones estructura2 = new EstructuraDeSecciones();

        estructura1.agregarComponente(seccion1);
        estructura2.agregarComponente(seccion2);

        Assert.assertNotEquals(estructura1, estructura2);

    }

    /*
    @Test
    public void queDosSeccionesConDiferenteTamanioSeanDistintas() {

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

        Assert.assertNotEquals(seccion1, seccion2);

    }*/


    
}
