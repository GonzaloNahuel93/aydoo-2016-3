package ar.edu.untref.aydoo;

public class Transformador {


    public TransformadoHTML transformar(Transformable elemento) {

        return this.transformarAHTML(elemento);

    }

    private TransformadoHTML transformarAHTML(Transformable elemento) {

        TransformadoHTML transformado = elemento.getTransformado();
        return transformado;

    }

}