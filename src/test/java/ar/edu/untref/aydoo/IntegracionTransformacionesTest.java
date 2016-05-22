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
                "</ul>\n"
), transformado.getContenido());

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
                "</section>\n"),transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteUnaSeccionConUnaListaAdentro() {

        Titulo titulo = new Titulo("Titulo");
        Subtitulo subtitulo = new Subtitulo("Subtitulo");
        Imagen imagen = new Imagen("Git.png");
        Lista lista = new Lista();
        ItemDeLista item1 = new ItemDeLista("item1");
        ItemDeLista item2 = new ItemDeLista("item2");
        lista.agregarItem(item1);
        lista.agregarItem(item2);
        Seccion seccion = new Seccion();

        seccion.agregarContenido(titulo);
        seccion.agregarContenido(subtitulo);
        seccion.agregarContenido(imagen);
        seccion.agregarContenido(lista);

        Transformador transformadorSeccion = new Transformador();
        TransformadoHTML transformado = transformadorSeccion.transformar(seccion);

        Assert.assertEquals(("<section>\n" +
                " <h1>Titulo</h1>\n" +
                " <h2>Subtitulo</h2>\n" +
                " <img src=\"Git.png\"/>\n" +
                "<ul>\n" +
                " <li>item1</li>\n" +
                " <li>item2</li>\n" +
                "</ul>\n" +
                "</section>\n"),transformado.getContenido());

    }

    @Test
    public void queRealiceUnaTransformacionCompletaCorrectamente() {

        Titulo titulo1 = new Titulo("Titulo1");
        Subtitulo subtitulo1 = new Subtitulo("Subtitulo1");
        Imagen imagen1 = new Imagen("Imagen1.png");
        Lista lista1 = new Lista();
        ItemDeLista item11 = new ItemDeLista("item1.1");
        ItemDeLista item12 = new ItemDeLista("item1.2");
        lista1.agregarItem(item11);
        lista1.agregarItem(item12);

        Titulo titulo2 = new Titulo("Titulo2");
        Subtitulo subtitulo2 = new Subtitulo("Subtitulo2");
        Imagen imagen2 = new Imagen("Imagen2.png");
        Lista lista2 = new Lista();
        ItemDeLista item21 = new ItemDeLista("item2.1");
        ItemDeLista item22 = new ItemDeLista("item2.2");
        lista2.agregarItem(item21);
        lista2.agregarItem(item22);

        Seccion seccion1 = new Seccion();
        seccion1.agregarContenido(titulo1);
        seccion1.agregarContenido(subtitulo1);
        seccion1.agregarContenido(imagen1);
        seccion1.agregarContenido(lista1);

        Seccion seccion2 = new Seccion();
        seccion2.agregarContenido(titulo2);
        seccion2.agregarContenido(subtitulo2);
        seccion2.agregarContenido(imagen2);
        seccion2.agregarContenido(lista2);

        EstructuraBase estructuraBase = new EstructuraBase();
        estructuraBase.agregarComponente(seccion1);
        estructuraBase.agregarComponente(seccion2);

        Transformador transformadorIntegrado = new Transformador();
        TransformadoHTML transformado = transformadorIntegrado.transformar(estructuraBase);

        Assert.assertEquals(("<section>\n" +
                " <h1>Titulo1</h1>\n" +
                " <h2>Subtitulo1</h2>\n" +
                " <img src=\"Imagen1.png\"/>\n" +
                "<ul>\n" +
                " <li>item1.1</li>\n" +
                " <li>item1.2</li>\n" +
                "</ul>\n" +
                "</section>\n" +

                "<section>\n" +
                " <h1>Titulo2</h1>\n" +
                " <h2>Subtitulo2</h2>\n" +
                " <img src=\"Imagen2.png\"/>\n" +
                "<ul>\n" +
                " <li>item2.1</li>\n" +
                " <li>item2.2</li>\n" +
                "</ul>\n" +
                "</section>\n"), transformado.getContenido());

    }

}