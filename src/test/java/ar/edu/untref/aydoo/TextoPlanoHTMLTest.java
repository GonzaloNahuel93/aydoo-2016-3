package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by synysterlove on 21/05/16.
 */
public class TextoPlanoHTMLTest {

    @Test
    public void queLaLineaEnHTMLDeTextoPlanoSeEscribaCorrectamente(){

        TextoPlanoHTML textoPlanoHTML = new TextoPlanoHTML("holis");
        String texto = textoPlanoHTML.getContenido();

        Assert.assertEquals("holis", texto);

    }
    
}
