package ar.edu.untref.aydoo;

public class ItemDeLista extends Elemento{


    public ItemDeLista(String contenido){
        super(contenido);
    }

    @Override
    public LineaHTML getTransformado() {

        ItemDeListaHTML itemDeListaHTML = new ItemDeListaHTML(this.getContenido());
        return itemDeListaHTML;

    }

}