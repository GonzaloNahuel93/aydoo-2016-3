package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {

    /*Tests de las transformaciones*/

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

}
