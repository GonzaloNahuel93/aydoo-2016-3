package ar.edu.untref.aydoo.Programa;

import ar.edu.untref.aydoo.Programa.Elementos.ComponenteHTML;
import ar.edu.untref.aydoo.Programa.Elementos.Elemento;
import ar.edu.untref.aydoo.Programa.Elementos.LineaHTML;

public class TransformacionDeLinea implements EstrategiaDeTransformacion {
    
    @Override
    public ComponenteHTML transformar(Elemento elemento) {

        LineaHTML transformado = elemento.getTransformado();
        return transformado;

    }
 
}