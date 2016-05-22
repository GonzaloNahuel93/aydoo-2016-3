package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Seccion implements Transformable {

    private List<Elemento> contenido;

    public Seccion() {
        this.contenido = new ArrayList<Elemento>();
    }
    
    @Override
    public TransformadoHTML getTransformado() {

        SeccionHTML seccionTransformada = this.transformarContenido(new SeccionHTML());
        return seccionTransformada;

    }

    private SeccionHTML transformarContenido(SeccionHTML seccionHTML) {

        Transformador transformadorContenido = new Transformador();
        
        for(Elemento elemento : this.contenido) {

            ElementoHTML elementoHTML = (ElementoHTML) transformadorContenido.transformar(elemento);
            seccionHTML.agregarElemento(elementoHTML);

        }

        return seccionHTML;

    }
    
    public void agregarContenido(Elemento elemento) {    
        this.contenido.add(elemento);     
    }
    
}