package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class CodigoHTML implements ElementoTransformadoHTML {

    List<SeccionHTML> seccionesHTML;

    public CodigoHTML() {
        this.seccionesHTML = new ArrayList<SeccionHTML>();
    }

    @Override
    public String getContenido() {

        String contenido = "";
        
        for(SeccionHTML seccion : this.seccionesHTML) {
            contenido += seccion.getContenido();
        }

        return contenido;

    }

    public void agregarSeccion(SeccionHTML seccion) {
        this.seccionesHTML.add(seccion);
    }

}