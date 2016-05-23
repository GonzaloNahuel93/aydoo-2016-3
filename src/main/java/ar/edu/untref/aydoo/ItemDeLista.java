package ar.edu.untref.aydoo;


public class ItemDeLista extends ElementoDefinidoPorUnCaracterDeEspecificacion {

    public ItemDeLista(String contenido){
        super(contenido);
    }

    @Override
    public ElementoTransformadoHTML getTransformado() {

        ItemDeListaHTML itemDeListaHTML = new ItemDeListaHTML(this.getContenido());
        return itemDeListaHTML;

    }

}