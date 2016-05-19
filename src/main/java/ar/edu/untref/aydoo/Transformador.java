package ar.edu.untref.aydoo;

/**
 * Created by synysterlove on 19/05/16.
 */
public class Transformador {

    private EstrategiaDeTransformacion estrategia;

    public Transformador(EstrategiaDeTransformacion estrategia) {

        this.estrategia = estrategia;

    }

    public ComponenteHTML transformar(Elemento elemento) {

        return this.estrategia.transformar(elemento);

    }
    
}
