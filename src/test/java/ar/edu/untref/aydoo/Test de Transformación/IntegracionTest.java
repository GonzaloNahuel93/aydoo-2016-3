package B.Transformacion;

import org.junit.Assert;
import org.junit.Test;

import C.ComponentesSimples.Titulo;
import D.ComponentesHTML.ComponenteHTML;

public class IntegracionTest {

    /*Tests de las transformaciones*/

    @Test
    public void queTransformeCorrectamenteUnTitulo() {

        Titulo titulo = new Titulo("Osvaldo vende humo");
        Transformador transformadorTitulo = new Transformador(new TransformacionDeLinea());
        ComponenteHTML componenteHTML = transformadorTitulo.transformar(titulo);
        Assert.assertEquals("<h1>Osvaldo vende humo</h1>", componenteHTML.getContenido());

    }

}
