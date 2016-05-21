package ar.edu.untref.aydoo;

public class TransformacionDeLinea implements EstrategiaDeTransformacion {
    
    @Override
    public ComponenteHTML transformar(Elemento elemento) {

        LineaHTML transformado = elemento.getTransformado();
        return transformado;

    }
 
}