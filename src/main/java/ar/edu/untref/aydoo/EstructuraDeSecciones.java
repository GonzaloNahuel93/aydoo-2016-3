package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class EstructuraDeSecciones implements Transformable {

    private List<Seccion> secciones;

    public EstructuraDeSecciones() {
        this.secciones = new ArrayList<Seccion>();
    }

    public void agregarComponente(Seccion seccion) {
        this.secciones.add(seccion);
    }

    public List<Seccion> getSecciones() {
        return this.secciones;
    }

    @Override
    public ElementoTransformadoHTML getTransformado() {

        CodigoHTML codigo = new CodigoHTML();
        Transformador transformadorDeSecciones = new Transformador();
        
        for (Seccion seccion : this.secciones) {
            codigo.agregarSeccion((SeccionHTML)transformadorDeSecciones.transformar(seccion));
        }
        
        return codigo;

    }
    
}