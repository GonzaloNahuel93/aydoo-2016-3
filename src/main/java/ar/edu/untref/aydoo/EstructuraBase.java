package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class EstructuraBase implements Transformable {

    private List<Seccion> secciones;

    public EstructuraBase() {
        this.secciones = new ArrayList<Seccion>();
    }

    public void agregarComponente(Seccion seccion) {
        this.secciones.add(seccion);
    }

    public List<Seccion> getSecciones() {
        return this.secciones;
    }

    @Override
    public TransformadoHTML getTransformado() {

        ArchivoHTML transformado = new ArchivoHTML();
        Transformador transformadorDeSecciones = new Transformador();
        
        for (Seccion seccion : this.secciones) {
            transformado.agregarSeccion((SeccionHTML)transformadorDeSecciones.transformar(seccion));
        }
        
        return transformado;

    }
    
}