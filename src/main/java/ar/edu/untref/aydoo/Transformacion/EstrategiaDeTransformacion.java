package B.Transformacion;

import C.ComponentesSimples.Elemento;
import D.ComponentesHTML.ComponenteHTML;

//Interface del Patron Strategy

public interface EstrategiaDeTransformacion {

    public ComponenteHTML transformar(Elemento elemento);

}