package ar.edu.untref.aydoo.Programa;

import ar.edu.untref.aydoo.Programa.Elementos.ComponenteHTML;
import ar.edu.untref.aydoo.Programa.Elementos.Elemento;

//Interface del Patron Strategy

public interface EstrategiaDeTransformacion {

    public ComponenteHTML transformar(Elemento elemento);

}