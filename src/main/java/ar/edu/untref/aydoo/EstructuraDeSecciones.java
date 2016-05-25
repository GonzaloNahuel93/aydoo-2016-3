package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class EstructuraDeSecciones implements Transformable {

    private List<Seccion> secciones;

    public EstructuraDeSecciones() {

        this.secciones = new ArrayList<Seccion>();

    }

    @Override
    public boolean equals(Object obj) {

        EstructuraDeSecciones otraEstructura = (EstructuraDeSecciones)obj;
        List<Seccion> otrasSecciones = otraEstructura.getSecciones();
        if(this.secciones.size() == otrasSecciones.size()) {

            for (int i = 0; i < this.secciones.size(); i++) {

                if(!this.secciones.get(i).equals(otrasSecciones.get(i))) {

                    return false;

                }

            }

            return true;

        }

        return false;

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

    @Override
    public void colocarStringDeContenidoPropio(String contenido) {} //Igual que la lista y la seccion, no tiene contenido propio
    
}