package ar.edu.untref.aydoo.elementos;

import ar.edu.untref.aydoo.TransformadoHTML;

public class ItemDeLista extends ElementoDeLinea {

    public ItemDeLista(String contenido){
        super(contenido);
    }

    @Override
    public TransformadoHTML getTransformado() {

        ItemDeListaHTML itemDeListaHTML = new ItemDeListaHTML(this.getContenido());
        return itemDeListaHTML;

    }

}