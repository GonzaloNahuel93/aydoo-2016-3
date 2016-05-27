package ar.edu.untref.aydoo.componentes;

import ar.edu.untref.aydoo.componenteshtml.ElementoTransformadoHTML;

public interface Transformable {

    public ElementoTransformadoHTML getTransformado();

    @Override
    public boolean equals(Object obj);

}