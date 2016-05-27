package ar.edu.untref.aydoo.componentes;

import java.util.ArrayList;
import java.util.List;
import ar.edu.untref.aydoo.Transformador;
import ar.edu.untref.aydoo.componenteshtml.CodigoHTML;
import ar.edu.untref.aydoo.componenteshtml.ElementoTransformadoHTML;
import ar.edu.untref.aydoo.componenteshtml.SeccionHTML;

public class EstructuraDeSecciones implements Transformable {

    private List<Seccion> secciones;
    private Transformador transformadorDeSecciones;

    public EstructuraDeSecciones() {

        this.secciones = new ArrayList<Seccion>();
        this.transformadorDeSecciones = new Transformador();

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

        for (Seccion seccion : this.secciones) {
            codigo.agregarSeccion((SeccionHTML)this.transformadorDeSecciones.transformar(seccion));
        }

        return codigo;

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

}