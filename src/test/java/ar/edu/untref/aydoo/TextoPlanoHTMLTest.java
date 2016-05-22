package ar.edu.untref.aydoo.tests;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.elementos.TextoPlanoHTML;

public class TextoPlanoHTMLTest {

    @Test
    public void queLaLineaEnHTMLDeTextoPlanoSeEscribaCorrectamente(){

        TextoPlanoHTML textoPlanoHTML = new TextoPlanoHTML("Esto es una frase para escribir dentro de una seccion");
        String texto = textoPlanoHTML.getContenido();

        Assert.assertEquals("Esto es una frase para escribir dentro de una seccion", texto);

    }
    
}