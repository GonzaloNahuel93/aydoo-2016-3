package B.Transformacion;

import C.ComponentesSimples.Elemento;
import D.ComponentesHTML.ComponenteHTML;


public class Transformador {

    private EstrategiaDeTransformacion estrategia;

    public Transformador(EstrategiaDeTransformacion estrategia) {
        this.estrategia = estrategia;
    }

    public ComponenteHTML transformar(Elemento elemento) {
        return this.estrategia.transformar(elemento);
    }
    
}