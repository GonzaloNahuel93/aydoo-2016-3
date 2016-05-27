package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IntegracionConstruccionYTransformacionTest {

    @Test
    public void queTransformeCorrectamenteUnEjemploIntegrador() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("---");
        listaDeEntrada.add("# Titulo");
        listaDeEntrada.add("i:java.jpg");
        listaDeEntrada.add("---");
        listaDeEntrada.add("*item1");
        listaDeEntrada.add("*item2");
        listaDeEntrada.add("*item3");
        listaDeEntrada.add("## Subtitulo");
        listaDeEntrada.add("hola");

        ConstructorDeEstructura constructor = new ConstructorDeEstructura();
        Transformador transformador = new Transformador();
        EstructuraDeSecciones estructura = constructor.construirEstructura(listaDeEntrada);
        ElementoTransformadoHTML transformado =  transformador.transformar(estructura);

        Assert.assertEquals(("<section>\n" +
                        "<h1>Titulo</h1>\n" +
                        "<img src=\"java.jpg\"/>\n" +
                        "</section>\n" +
                        "<section>\n" +
                        "<ul>\n" +
                        "<li>item1</li>\n" +
                        "<li>item2</li>\n" +
                        "<li>item3</li>\n" +
                        "</ul>\n" +
                        "<h2>Subtitulo</h2>\n" +
                        "hola\n" +
                        "</section>\n")
                , transformado.getContenido());

    }
    
}