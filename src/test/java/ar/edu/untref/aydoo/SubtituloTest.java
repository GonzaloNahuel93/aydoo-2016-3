package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by synysterlove on 24/05/16.
 */
public class SubtituloTest {
    
    @Test
    public void queDosSubtitulosIgualesSeanIguales() {
        
        Subtitulo subtitulo1 = new Subtitulo("Subtitulo");
        Subtitulo subtitulo2 = new Subtitulo("Subtitulo");
        
        Assert.assertTrue(subtitulo1.equals(subtitulo2));
        
    }
    
    @Test
    public void queDosSubtitulosDistintosSeanDistintos() {
        
        Subtitulo subtitulo1 = new Subtitulo("Subtitulo1");
        Subtitulo subtitulo2 = new Subtitulo("Subtitulo2");
        
        Assert.assertFalse(subtitulo1.equals(subtitulo2));
        
    }
    
    @Test
    public void queElContenidoDelSubtituloSeSeteeCorrectamenteAPartirDelStringQueLoRepresenta() {
        
        Subtitulo subtitulo = new Subtitulo("");
        subtitulo.colocarStringDeContenidoPropio("## Subtitulo");
        
        Assert.assertEquals("Subtitulo", subtitulo.getContenido());
        
    }
    
}
