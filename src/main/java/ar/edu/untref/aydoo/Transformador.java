package ar.edu.untref.aydoo;


public class Transformador {

    public ElementoTransformadoHTML transformar(Transformable elemento) {

        ElementoTransformadoHTML transformado = elemento.getTransformado();
        return transformado;

    }

}