package ar.edu.untref.aydoo.elementos;

import java.util.ArrayList;
import java.util.List;

import ar.edu.untref.aydoo.TransformadoHTML;

public class SeccionHTML implements TransformadoHTML {

    private List<ElementoHTML> contenido;

    public SeccionHTML() {
        this.contenido = new ArrayList<ElementoHTML>();
    }

    public void agregarElemento(ElementoHTML elementoHTML) {
        this.contenido.add(elementoHTML);
    }

    @Override
    public String getContenido() {
        return "<section>\n" + this.construirStringDeContenidos() + "</section>\n";
    }

    private String construirStringDeContenidos() {

        String stringContenido = "";

        for(ElementoHTML elemento: this.contenido){
            stringContenido = elemento.concatenarContenido(stringContenido);
        }

        return stringContenido;

    }

}