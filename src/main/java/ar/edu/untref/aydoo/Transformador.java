package ar.edu.untref.aydoo;

public class Transformador {

    private EstrategiaDeTransformacion estrategia;

    public Transformador(EstrategiaDeTransformacion estrategia) {
        this.estrategia = estrategia;
    }

    public ComponenteHTML transformar(Elemento elemento) {
        return this.estrategia.transformar(elemento);
    }
    
}