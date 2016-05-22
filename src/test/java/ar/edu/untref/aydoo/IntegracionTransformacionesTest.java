package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTransformacionesTest {

    //Tests de las Transformaciones de Linea

    @Test
    public void queTransformeCorrectamenteUnTitulo() {

        Titulo titulo = new Titulo("Esto es un titulo");
        Transformador transformadorTitulo = new Transformador();
        
        ComponenteHTML transformado = transformadorTitulo.transformar(titulo);
        
        Assert.assertEquals("<h1>Esto es un titulo</h1>", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteUnSubtitulo() {

        Subtitulo subtitulo = new Subtitulo("Esto es un subtitulo");
        Transformador transformadorSubtitulo = new Transformador();
        
        ComponenteHTML transformado = transformadorSubtitulo.transformar(subtitulo);
        
        Assert.assertEquals("<h2>Esto es un subtitulo</h2>", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteUnaImagen() {

        Imagen imagen = new Imagen("Esto es una imagen.jpg");
        Transformador transformadorImagen = new Transformador();
        
        ComponenteHTML transformado = transformadorImagen.transformar(imagen);
        
        Assert.assertEquals("<img src=\"Esto es una imagen.jpg\"/>", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteTextoPlano() {

        LineaDeTextoPlano texto = new LineaDeTextoPlano("Esto es una linea");
        Transformador transformadorTexto = new Transformador();
        
        ComponenteHTML transformado = transformadorTexto.transformar(texto);
        
        Assert.assertEquals("Esto es una linea", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteUnItemDeLista() {

        ItemDeLista item = new ItemDeLista("Esto es un item de lista");
        Transformador transformadorItem = new Transformador();
        
        ComponenteHTML transformado = transformadorItem.transformar(item);
        
        Assert.assertEquals("<li>Esto es un item de lista</li>", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteUnaLista() {

        ItemDeLista item1 = new ItemDeLista("Hola");
        ItemDeLista item2 = new ItemDeLista("Chau");
        Lista lista = new Lista();
        lista.agregarItem(item1);
        lista.agregarItem(item2);

        Transformador transformadorLista = new Transformador();
        ComponenteHTML transformado = transformadorLista.transformar(lista);

        Assert.assertEquals(("<ul>\n" +
                " <li>Hola</li>\n" +
                " <li>Chau</li>\n" +
                "</ul>"), transformado.getContenido());

    }

}