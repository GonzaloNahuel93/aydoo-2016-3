package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ImagenTest {
  
    @Test
    public void queDosImagenesIgualesSeanIguales() {
        
        Imagen imagen1 = new Imagen("Imagen.png");
        Imagen imagen2 = new Imagen("Imagen.png");
        
        Assert.assertTrue(imagen1.equals(imagen2));
        
    }
    
    @Test
    public void queDosImagenesDistintosSeanDistintos() {
        
        Imagen imagen1 = new Imagen("Imagen1.png");
        Imagen imagen2 = new Imagen("Imagen2.png");
        
        Assert.assertFalse(imagen1.equals(imagen2));
        
    }
    
    @Test
    public void queElContenidoDeLaImagenSeSeteeCorrectamenteAPartirDelStringQueLaRepresenta() {
        
        Imagen imagen = new Imagen("");
        imagen.colocarStringDeContenidoPropio("i:imagen.png");
        
        Assert.assertEquals("imagen.png", imagen.getContenido());
        
    }
    
}
