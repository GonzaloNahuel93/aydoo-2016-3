package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by synysterlove on 23/05/16.
 */
public class IntegracionConstructorDeSeccionTest {

    /* Quiero hacer que a partir de una lista de strings,
    donde cada string es una linea leida del archivo de entrada,
    sea transformado en un Elemento.
     */

    @Test
    public void quePuedaConstruirUnaSeccionConUnTitulo() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("# Titulo");

        ConstructorDeSeccion constructor = new ConstructorDeSeccion();

        Seccion seccionConstruida = constructor.construirSeccion(listaDeEntrada);

        Seccion seccion = new Seccion();
        Titulo titulo = new Titulo("Titulo");
        seccion.agregarContenido(titulo);

        Assert.assertEquals(seccion, seccionConstruida);

    }


    @Test
    public void quePuedaConstruirUnaSeccionConUnTituloYUnSubtitulo() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("# Titulo");
        listaDeEntrada.add("## Subtitulo");

        ConstructorDeSeccion constructor = new ConstructorDeSeccion();

        Seccion seccionConstruida = constructor.construirSeccion(listaDeEntrada);

        Seccion seccion = new Seccion();
        Titulo titulo = new Titulo("Titulo");
        Subtitulo subtitulo = new Subtitulo("Subtitulo");
        seccion.agregarContenido(titulo);
        seccion.agregarContenido(subtitulo);

        Assert.assertEquals(seccion, seccionConstruida);

    }


    @Test
    public void quePuedaConstruirUnaSeccionConUnSubituloYUnTituloEnEseOrden() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("## Subtitulo");
        listaDeEntrada.add("# Titulo");

        ConstructorDeSeccion constructor = new ConstructorDeSeccion();

        Seccion seccionConstruida = constructor.construirSeccion(listaDeEntrada);

        Seccion seccion = new Seccion();
        Titulo titulo = new Titulo("Titulo");
        Subtitulo subtitulo = new Subtitulo("Subtitulo");
        seccion.agregarContenido(subtitulo);
        seccion.agregarContenido(titulo);

        Assert.assertEquals(seccion, seccionConstruida);

    }


    @Test
    public void quePuedaConstruirUnaSeccionConTextoPlano() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("Esto es textito simple");

        ConstructorDeSeccion constructor = new ConstructorDeSeccion();

        Seccion seccionConstruida = constructor.construirSeccion(listaDeEntrada);

        Seccion seccion = new Seccion();
        TextoPlano texto = new TextoPlano("Esto es textito simple");
        seccion.agregarContenido(texto);

        Assert.assertEquals(seccion, seccionConstruida);

    }


    @Test
    public void quePuedaConstruirUnaSeccionConUnaImagen() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("i:aydoo.png");

        ConstructorDeSeccion constructor = new ConstructorDeSeccion();

        Seccion seccionConstruida = constructor.construirSeccion(listaDeEntrada);

        Seccion seccion = new Seccion();
        Imagen imagen = new Imagen("aydoo.png");
        seccion.agregarContenido(imagen);

        Assert.assertEquals(seccion, seccionConstruida);

    }


    @Test
    public void quePuedaConstruirUnaSeccionConDosTitulos() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("# Titulo1");
        listaDeEntrada.add("# Titulo2");

        ConstructorDeSeccion constructor = new ConstructorDeSeccion();

        Seccion seccionConstruida = constructor.construirSeccion(listaDeEntrada);

        Seccion seccion = new Seccion();
        Titulo titulo1 = new Titulo("Titulo1");
        Titulo titulo2 = new Titulo("Titulo2");
        seccion.agregarContenido(titulo1);
        seccion.agregarContenido(titulo2);

        Assert.assertEquals(seccion, seccionConstruida);

    }


    @Test
    public void quePuedaConstruirUnaSeccionConUnaLista() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("*item1");
        listaDeEntrada.add("*item2");
        listaDeEntrada.add("*item3");

        ConstructorDeSeccion constructor = new ConstructorDeSeccion();

        Seccion seccionConstruida = constructor.construirSeccion(listaDeEntrada);

        Seccion seccion = new Seccion();
        ItemDeLista item1 = new ItemDeLista("item1");
        ItemDeLista item2 = new ItemDeLista("item2");
        ItemDeLista item3 = new ItemDeLista("item3");
        Lista lista = new Lista();
        lista.agregarItem(item1);
        lista.agregarItem(item2);
        lista.agregarItem(item3);
        seccion.agregarContenido(lista);

        Assert.assertEquals(seccion, seccionConstruida);

    }


    @Test
    public void quePuedaConstruirUnaSeccionConUnPocoDeTodo() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("# TituloPrincipal");
        listaDeEntrada.add("## Lista");
        listaDeEntrada.add("*item1");
        listaDeEntrada.add("*item2");
        listaDeEntrada.add("*item3");
        listaDeEntrada.add("i:palace.png");

        ConstructorDeSeccion constructor = new ConstructorDeSeccion();

        Seccion seccionConstruida = constructor.construirSeccion(listaDeEntrada);

        Seccion seccion = new Seccion();
        Titulo titulo = new Titulo("TituloPrincipal");
        Subtitulo subtitulo = new Subtitulo("Lista");
        ItemDeLista item1 = new ItemDeLista("item1");
        ItemDeLista item2 = new ItemDeLista("item2");
        ItemDeLista item3 = new ItemDeLista("item3");
        Lista lista = new Lista();
        lista.agregarItem(item1);
        lista.agregarItem(item2);
        lista.agregarItem(item3);
        Imagen imagen = new Imagen("palace.png");
        seccion.agregarContenido(titulo);
        seccion.agregarContenido(subtitulo);
        seccion.agregarContenido(lista);
        seccion.agregarContenido(imagen);

        Assert.assertEquals(seccion, seccionConstruida);

    }

    @Test
    public void quePuedaConstruirUnaSecionVacia() {

        List<String> listaDeEntrada = new ArrayList<String>();

        ConstructorDeSeccion constructor = new ConstructorDeSeccion();

        Seccion seccionConstruida = constructor.construirSeccion(listaDeEntrada);

        Seccion seccion = new Seccion();

        Assert.assertEquals(seccion, seccionConstruida);

    }



}
