package ar.edu.untref.aydoo;

public class ItemDeLista extends ElementoSimple {

    public ItemDeLista(String contenido){
        super(contenido);
    }

    @Override
    public ComponenteHTML getTransformado() {

        ItemDeListaHTML itemDeListaHTML = new ItemDeListaHTML(this.getContenido());
        return itemDeListaHTML;

    }

}