package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by synysterlove on 23/05/16.
 */
public class ConstructorDeObjetosATransformarTest {

    /* Quiero hacer que a partir de una lista de strings,
    donde cada string es una linea leida del archivo de entrada,
    sea transformado en un Elemento.
     */

    @Test
    public void quePuedaConstruirUnTitulo() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("#Titulo");

        ConstructorDeObjetosATransformar constructor = new ConstructorDeObjetosATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        Titulo titulo = new Titulo("Titulo");

        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(titulo, objetosConstruidos));

    }


    @Test
    public void quePuedaConstruirUnTituloYUnSubtitulo() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("#Titulo");
        listaDeEntrada.add("##Subtitulo");

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
        listaDeEntrada.add("##Subtitulo");
        listaDeEntrada.add("#Titulo");

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
