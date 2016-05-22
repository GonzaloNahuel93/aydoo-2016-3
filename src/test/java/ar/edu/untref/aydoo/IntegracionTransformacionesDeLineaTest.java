package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTransformacionesDeLineaTest {

    //Tests de las Transformaciones de Linea

    @Test
    public void queTransformeCorrectamenteUnTitulo() {

        Titulo titulo = new Titulo("Esto es un titulo");
        Transformador transformadorTitulo = new Transformador(new TransformacionDeLinea());
        
        ComponenteHTML transformado = transformadorTitulo.transformar(titulo);
        
        Assert.assertEquals("<h1>Esto es un titulo</h1>", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteUnSubtitulo() {

        Subtitulo subtitulo = new Subtitulo("Esto es un subtitulo");
        Transformador transformadorSubtitulo = new Transformador(new TransformacionDeLinea());
        
        ComponenteHTML transformado = transformadorSubtitulo.transformar(subtitulo);
        
        Assert.assertEquals("<h2>Esto es un subtitulo</h2>", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteUnaImagen() {

        Imagen imagen = new Imagen("Esto es una imagen.jpg");
        Transformador transformadorImagen = new Transformador(new TransformacionDeLinea());
        
        ComponenteHTML transformado = transformadorImagen.transformar(imagen);
        
        Assert.assertEquals("<img src=\"Esto es una imagen.jpg\"/>", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteTextoPlano() {

        LineaDeTextoPlano texto = new LineaDeTextoPlano("Esto es una linea");
        Transformador transformadorTexto = new Transformador(new TransformacionDeLinea());
        
        ComponenteHTML transformado = transformadorTexto.transformar(texto);
        
        Assert.assertEquals("Esto es una linea", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteUnItemDeLista() {

        ItemDeLista item = new ItemDeLista("Esto es un item de lista");
        Transformador transformadorItem = new Transformador(new TransformacionDeLinea());
        
        ComponenteHTML transformado = transformadorItem.transformar(item);
        
        Assert.assertEquals("<li>Esto es un item de lista</li>", transformado.getContenido());

    }

}