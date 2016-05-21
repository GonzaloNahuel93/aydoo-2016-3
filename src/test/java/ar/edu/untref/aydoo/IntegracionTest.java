package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {

    /*Tests de las transformaciones de linea*/

    @Test
    public void queTransformeCorrectamenteUnTitulo() {

        Titulo titulo = new Titulo("Osvaldo vende humo");
        Transformador transformadorTitulo = new Transformador(new TransformacionDeLinea());
        ComponenteHTML transformado = transformadorTitulo.transformar(titulo);
        Assert.assertEquals("<h1>Osvaldo vende humo</h1>", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteUnSubtitulo() {

        Subtitulo subtitulo = new Subtitulo("No te apachorres");
        Transformador transformadorSubtitulo = new Transformador(new TransformacionDeLinea());
        ComponenteHTML transformado = transformadorSubtitulo.transformar(subtitulo);
        Assert.assertEquals("<h2>No te apachorres</h2>", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteUnaImagen() {

        Imagen imagen = new Imagen("Caca.jpg");
        Transformador transformadorImagen = new Transformador(new TransformacionDeLinea());
        ComponenteHTML transformado = transformadorImagen.transformar(imagen);
        Assert.assertEquals("<img src=\"Caca.jpg\"/>", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteTextoPlano() {

        LineaDeTextoPlano texto = new LineaDeTextoPlano("soy una linea");
        Transformador transformadorTexto = new Transformador(new TransformacionDeLinea());
        ComponenteHTML transformado = transformadorTexto.transformar(texto);
        Assert.assertEquals("soy una linea", transformado.getContenido());

    }

    @Test
    public void queTransformeCorrectamenteUnItemDeLista() {

        ItemDeLista item = new ItemDeLista("soy un item");
        Transformador transformadorItem = new Transformador(new TransformacionDeLinea());
        ComponenteHTML transformado = transformadorItem.transformar(item);
        Assert.assertEquals("<li>soy un item</li>", transformado.getContenido());

    }

    /*Transformaciones de bloque*/

    @Test
    public void queTransformeCorrectamenteUnaSeccion() {



    }


}