package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by synysterlove on 23/05/16.
 */
public class IntegracionConstructorDeObjetosATransformarTest {

    /* Quiero hacer que a partir de una lista de strings,
    donde cada string es una linea leida del archivo de entrada,
    sea transformado en un Elemento.
     */

    @Test
    public void quePuedaConstruirUnTitulo() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("# Titulo");

        ConstructorDeObjetosATransformar constructor = new ConstructorDeObjetosATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        Titulo titulo = new Titulo("Titulo");

        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(titulo, objetosConstruidos));

    }


    @Test
    public void quePuedaConstruirUnTituloYUnSubtitulo() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("# Titulo");
        listaDeEntrada.add("## Subtitulo");

        ConstructorDeObjetosATransformar constructor = new ConstructorDeObjetosATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        Titulo titulo = new Titulo("Titulo");
        Subtitulo subtitulo = new Subtitulo("Subtitulo");

        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(titulo, objetosConstruidos));
        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(subtitulo, objetosConstruidos));

    }

    @Test
    public void quePuedaConstruirUnSubituloYUnTituloEnEseOrden() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("## Subtitulo");
        listaDeEntrada.add("# Titulo");

        ConstructorDeObjetosATransformar constructor = new ConstructorDeObjetosATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        Titulo titulo = new Titulo("Titulo");
        Subtitulo subtitulo = new Subtitulo("Subtitulo");

        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(titulo, objetosConstruidos));
        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(subtitulo, objetosConstruidos));

    }

    @Test
    public void quePuedaConstruirTextoPlano() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("Esto es textito simple");

        ConstructorDeObjetosATransformar constructor = new ConstructorDeObjetosATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        TextoPlano texto = new TextoPlano("Esto es textito simple");

        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(texto, objetosConstruidos));

    }

    @Test
    public void quePuedaConstruirUnaImagen() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("i:aydoo.png");

        ConstructorDeObjetosATransformar constructor = new ConstructorDeObjetosATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        Imagen imagen = new Imagen("aydoo.png");

        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(imagen, objetosConstruidos));

    }

    @Test
    public void quePuedaConstruirDosTitulos() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("# Titulo1");
        listaDeEntrada.add("# Titulo2");

        ConstructorDeObjetosATransformar constructor = new ConstructorDeObjetosATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        Titulo titulo1 = new Titulo("Titulo1");
        Titulo titulo2 = new Titulo("Titulo2");

        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(titulo1, objetosConstruidos));
        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(titulo2, objetosConstruidos));


    }

    @Test
    public void quePuedaConstruirUnaLista() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("*item1");
        listaDeEntrada.add("*item2");
        listaDeEntrada.add("*item3");

        ConstructorDeObjetosATransformar constructor = new ConstructorDeObjetosATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        ItemDeLista item1 = new ItemDeLista("item1");
        ItemDeLista item2 = new ItemDeLista("item2");
        ItemDeLista item3 = new ItemDeLista("item3");
        Lista lista = new Lista();
        lista.agregarItem(item1);
        lista.agregarItem(item2);
        lista.agregarItem(item3);

        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(lista, objetosConstruidos));

    }

    @Test
    public void quePuedaConstruirUnaSeccion() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("---");
        listaDeEntrada.add("# Titulo");
        listaDeEntrada.add("i:java.jpg");

        Seccion seccion = new Seccion();
        seccion.agregarContenido(new Titulo("Titulo"));
        seccion.agregarContenido(new Imagen("java.jpg"));

        ConstructorDeObjetosATransformar constructor = new ConstructorDeObjetosATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(seccion, objetosConstruidos));

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

        ConstructorDeObjetosATransformar constructor = new ConstructorDeObjetosATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        Assert.assertEquals(seccion1, objetosConstruidos.get(0));
        Assert.assertEquals(seccion2, objetosConstruidos.get(1));

    }


    /*
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

        ConstructorDeObjetosATransformar constructor = new ConstructorDeObjetosATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(seccion, objetosConstruidos));

    }*/

    /* Necesito definir este metodo para averiguar
    si una lista contiene determinado elemento.
    Contains no me sirve porque no sabe
    comparar elementos
     */
    private boolean verificarSiElObjetoEstaEnLaLista(Transformable objeto, List<Transformable> objetosConstruidos) {

        for (Transformable objetoActual : objetosConstruidos) {

            if(objetoActual.equals(objeto)) return true;

        }
        return false;

    }

}
