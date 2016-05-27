package ar.edu.untref.aydoo.componentes;

import java.util.ArrayList;
import java.util.List;
import ar.edu.untref.aydoo.Transformador;
import ar.edu.untref.aydoo.componenteshtml.ElementoHTML;
import ar.edu.untref.aydoo.componenteshtml.ElementoTransformadoHTML;
import ar.edu.untref.aydoo.componenteshtml.SeccionHTML;

public class Seccion implements Transformable {

    private List<Elemento> contenido;

    public Seccion() {
        this.contenido = new ArrayList<Elemento>();
    }

    @Override
    public ElementoTransformadoHTML getTransformado() {

        SeccionHTML seccionTransformada = this.transformarContenido(new SeccionHTML());
        return seccionTransformada;

    }

    public void agregarContenido(Elemento elemento) {    
        this.contenido.add(elemento);     
    }

    public List<Elemento> getElementos() {
        return this.contenido;
    }

    @Override
    public boolean equals(Object obj) {

        Seccion otraSeccion = (Seccion)obj;
        List<Elemento> otrosElementos = otraSeccion.getElementos();
        List<Elemento> estosElementos = this.getElementos();

        if(otrosElementos.size() != estosElementos.size()) return false;

        for(int i=0; i < estosElementos.size(); i++) { //Las dos secciones tienen que ser del mismo tamaño asi que no hay riesgo de excepcion
            if(!estosElementos.get(i).equals(otrosElementos.get(i))) return false; //Si algun par de elementos es distinto, tira falso
        }

        return true; //Si todos fueron iguales, se retorna true

    }

    private SeccionHTML transformarContenido(SeccionHTML seccionHTML) {

        Transformador transformadorContenido = new Transformador();

        for(Elemento elemento : this.contenido) {

            ElementoHTML elementoHTML = (ElementoHTML) transformadorContenido.transformar(elemento);
            seccionHTML.agregarElemento(elementoHTML);

        }

        return seccionHTML;

    }

}