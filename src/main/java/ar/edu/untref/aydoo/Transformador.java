package ar.edu.untref.aydoo;

public class Transformador {


    public ComponenteHTML transformar(Transformable elemento) {

        return this.transformarAHTML(elemento);

    }

    public ComponenteHTML transformarAHTML(Transformable elemento) {

        ComponenteHTML transformado = elemento.getTransformado();
        return transformado;

    }

}