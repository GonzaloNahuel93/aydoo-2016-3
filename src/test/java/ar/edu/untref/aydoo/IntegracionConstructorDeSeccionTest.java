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

        ConstructorDeSeccionATransformar constructor = new ConstructorDeSeccionATransformar();

        Seccion seccionConstruida = constructor.construirSeccion(listaDeEntrada);

        Seccion seccion = new Seccion();
        Titulo titulo = new Titulo("Titulo");
        seccion.agregarContenido(titulo);

        Assert.assertEquals(seccion, seccionConstruida);

    }

    /*
    @Test
    public void quePuedaConstruirUnTituloYUnSubtitulo() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("# Titulo");
        listaDeEntrada.add("## Subtitulo");

        ConstructorDeSeccionATransformar constructor = new ConstructorDeSeccionATransformar();

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

        ConstructorDeSeccionATransformar constructor = new ConstructorDeSeccionATransformar();

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

        ConstructorDeSeccionATransformar constructor = new ConstructorDeSeccionATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        TextoPlano texto = new TextoPlano("Esto es textito simple");

        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(texto, objetosConstruidos));

    }

    @Test
    public void quePuedaConstruirUnaImagen() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("i:aydoo.png");

        ConstructorDeSeccionATransformar constructor = new ConstructorDeSeccionATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        Imagen imagen = new Imagen("aydoo.png");

        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(imagen, objetosConstruidos));

    }

    @Test
    public void quePuedaConstruirDosTitulos() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("# Titulo1");
        listaDeEntrada.add("# Titulo2");

        ConstructorDeSeccionATransformar constructor = new ConstructorDeSeccionATransformar();

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

        ConstructorDeSeccionATransformar constructor = new ConstructorDeSeccionATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        ItemDeLista item1 = new ItemDeLista("item1");
        ItemDeLista item2 = new ItemDeLista("item2");
        ItemDeLista item3 = new ItemDeLista("item3");
        Lista lista = new Lista();
        lista.agregarItem(item1);
        lista.agregarItem(item2);
        lista.agregarItem(item3);

        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(lista, objetosConstruidos));

    }*/


    /* Necesito definir este metodo para averiguar
    si una lista contiene determinado elemento.
    Contains no me sirve porque no sabe
    comparar elementos
     */
    private boolean verificarSiElObjetoEstaEnLaLista(Elemento objeto, List<Elemento> objetosConstruidos) {

        for (Elemento objetoActual : objetosConstruidos) {

            if(objetoActual.equals(objeto)) return true;

        }
        return false;

    }

}
