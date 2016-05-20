package B.Transformacion;

import C.ComponentesSimples.Elemento;
import D.ComponentesHTML.ComponenteHTML;
import D.ComponentesHTML.LineaHTML;

public class TransformacionDeLinea implements EstrategiaDeTransformacion {
    
    @Override
    public ComponenteHTML transformar(Elemento elemento) {

        LineaHTML transformado = elemento.getTransformado();
        return transformado;

    }
 
}