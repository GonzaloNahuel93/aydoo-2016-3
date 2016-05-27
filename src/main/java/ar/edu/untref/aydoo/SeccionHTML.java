package ar.edu.untref.aydoo.componenteshtml;

import java.util.ArrayList;
import java.util.List;

public class SeccionHTML implements ElementoTransformadoHTML {

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