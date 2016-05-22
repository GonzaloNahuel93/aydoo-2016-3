package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTransformacionesTest {

    //Tests de las Transformaciones de Linea

    @Test
    public void queTransformeCorrectamenteUnTitulo() {

        Titulo titulo = new Titulo("Esto es un titulo");
        Transformador transformadorTitulo = new Transformador();
        
        TransformadoHTML transformado = transformadorTitulo.transformar(titulo);
        
        Assert.assertEquals("<h1>Esto es un titulo</h1>", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteUnSubtitulo() {

        Subtitulo subtitulo = new Subtitulo("Esto es un subtitulo");
        Transformador transformadorSubtitulo = new Transformador();
        
        TransformadoHTML transformado = transformadorSubtitulo.transformar(subtitulo);
        
        Assert.assertEquals("<h2>Esto es un subtitulo</h2>", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteUnaImagen() {

        Imagen imagen = new Imagen("Esto es una imagen.jpg");
        Transformador transformadorImagen = new Transformador();
        
        TransformadoHTML transformado = transformadorImagen.transformar(imagen);
        
        Assert.assertEquals("<img src=\"Esto es una imagen.jpg\"/>", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteTextoPlano() {

        LineaDeTextoPlano texto = new LineaDeTextoPlano("Esto es una linea");
        Transformador transformadorTexto = new Transformador();
        
        TransformadoHTML transformado = transformadorTexto.transformar(texto);
        
        Assert.assertEquals("Esto es una linea", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteUnItemDeLista() {

        ItemDeLista item = new ItemDeLista("Esto es un item de lista");
        Transformador transformadorItem = new Transformador();
        
        TransformadoHTML transformado = transformadorItem.transformar(item);
        
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
        TransformadoHTML transformado = transformadorLista.transformar(lista);

        Assert.assertEquals(("<ul>\n" +
                " <li>Hola</li>\n" +
                " <li>Chau</li>\n" +
                "</ul>"), transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteUnaSeccion() {

        Titulo titulo = new Titulo("Titulo");
        Subtitulo subtitulo = new Subtitulo("Subtitulo");
        Imagen imagen = new Imagen("Git.png");
        Seccion seccion = new Seccion();

        seccion.agregarContenido(titulo);
        seccion.agregarContenido(subtitulo);
        seccion.agregarContenido(imagen);

        Transformador transformadorSeccion = new Transformador();
        TransformadoHTML transformado = transformadorSeccion.transformar(seccion);

        Assert.assertEquals(("<section>\n" +
                " <h1>Titulo</h1>\n" +
                " <h2>Subtitulo</h2>\n" +
                " <img src=\"Git.png\"/>\n" +
                "</section>"),transformado.getContenido());

    }

}