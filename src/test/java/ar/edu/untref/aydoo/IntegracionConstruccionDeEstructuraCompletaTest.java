package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IntegracionConstruccionDeEstructuraCompletaTest {


    @Test
    public void quePuedaConstruirUnaEstructuraConUnaSeccion() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("---");
        listaDeEntrada.add("# Titulo");
        listaDeEntrada.add("i:java.jpg");

        ConstructorDeEstructura constructor = new ConstructorDeEstructura();

        EstructuraDeSecciones estructuraConstruida = constructor.construirEstructura(listaDeEntrada);

        EstructuraDeSecciones estructura = new EstructuraDeSecciones();
        Seccion seccion = new Seccion();
        seccion.agregarContenido(new Titulo("Titulo"));
        seccion.agregarContenido(new Imagen("java.jpg"));
        estructura.agregarComponente(seccion);

        Assert.assertEquals(estructura, estructuraConstruida);

    }

    @Test
    public void quePuedaConstruirDosSecciones() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("---");
        listaDeEntrada.add("# Titulo");
        listaDeEntrada.add("i:java.jpg");
        listaDeEntrada.add("---");
        listaDeEntrada.add("# Subtitulo");

        Seccion seccion1 = new Seccion();
        seccion1.agregarContenido(new Titulo("Titulo"));
        seccion1.agregarContenido(new Imagen("java.jpg"));

        Seccion seccion2 = new Seccion();
        seccion2.agregarContenido(new Subtitulo("Subtitulo"));

        EstructuraDeSecciones estructura = new EstructuraDeSecciones();
        estructura.agregarComponente(seccion1);
        estructura.agregarComponente(seccion2);

        ConstructorDeEstructura constructor = new ConstructorDeEstructura();

        EstructuraDeSecciones estructuraConstruida = constructor.construirEstructura(listaDeEntrada);

        Assert.assertEquals(estructura, estructuraConstruida);

    }

    @Test
    public void quePuedaConstruirUnaSeccionConUnaListaDentro() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("---");
        listaDeEntrada.add("*item1");
        listaDeEntrada.add("*item2");
        listaDeEntrada.add("*item3");

        Seccion seccion = new Seccion();
        Lista lista = new Lista();
        lista.agregarItem(new ItemDeLista("item1"));
        lista.agregarItem(new ItemDeLista("item2"));
        lista.agregarItem(new ItemDeLista("item3"));
        seccion.agregarContenido(lista);

        EstructuraDeSecciones estructura = new EstructuraDeSecciones();
        estructura.agregarComponente(seccion);

        ConstructorDeEstructura constructor = new ConstructorDeEstructura();

        EstructuraDeSecciones estructuraConstruida = constructor.construirEstructura(listaDeEntrada);

        Assert.assertEquals(estructura, estructuraConstruida);

    }

    @Test
    public void quePuedaConstruirUnaEstructuraConUnaSeccionVacia() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("---");

        ConstructorDeEstructura constructor = new ConstructorDeEstructura();
        EstructuraDeSecciones estructuraConstruida = constructor.construirEstructura(listaDeEntrada);

        Seccion seccion = new Seccion();
        EstructuraDeSecciones estructura = new EstructuraDeSecciones();
        estructura.agregarComponente(seccion);

        Assert.assertEquals(estructura, estructuraConstruida);
    }

    @Test(expected=SintaxisDelArchivoDeEntradaInvalidaException.class)
    public void queNoPuedaConstruirUnaEstructuraSiLeVieneAlgoFueraDeUnaSeccion() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("# Titulo");

        ConstructorDeEstructura constructor = new ConstructorDeEstructura();
        EstructuraDeSecciones estructuraConstruida = constructor.construirEstructura(listaDeEntrada);

        estructuraConstruida.getSecciones();

    }
    
}