package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TituloTest {

    @Test
    public void queDosTitulosIgualesSeanIguales() {

        Titulo titulo1 = new Titulo("Titulo");
        Titulo titulo2 = new Titulo("Titulo");

        Assert.assertTrue(titulo1.equals(titulo2));

    }

    @Test
    public void queDosTitulosDistintosSeanDistintos() {

        Titulo titulo1 = new Titulo("Titulo1");
        Titulo titulo2 = new Titulo("Titulo2");

        Assert.assertFalse(titulo1.equals(titulo2));

    }

    @Test
    public void queElContenidoDelTituloSeSeteeCorrectamenteAPartirDelStringQueLoRepresenta() {

        Titulo titulo = new Titulo("");
        titulo.colocarStringDeContenidoPropio("# Titulo");

        Assert.assertEquals("Titulo", titulo.getContenido());

    }
    
}