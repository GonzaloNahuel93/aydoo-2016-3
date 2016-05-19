package ar.edu.untref.aydoo;

/**
 * Created by synysterlove on 19/05/16.
 */
public class TransformacionDeLinea implements EstrategiaDeTransformacion {
    
    @Override
    public ComponenteHTML transformar(Elemento elemento) {

        LineaHTML transformado = elemento.getTransformado();
        return transformado;

    }
}
