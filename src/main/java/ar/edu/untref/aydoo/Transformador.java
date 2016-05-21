package ar.edu.untref.aydoo.Programa;

import ar.edu.untref.aydoo.Programa.Elementos.ComponenteHTML;
import ar.edu.untref.aydoo.Programa.Elementos.Elemento;

public class Transformador {

    private EstrategiaDeTransformacion estrategia;

    public Transformador(EstrategiaDeTransformacion estrategia) {
        this.estrategia = estrategia;
    }

    public ComponenteHTML transformar(Elemento elemento) {
        return this.estrategia.transformar(elemento);
    }
    
}