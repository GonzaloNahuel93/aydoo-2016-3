package ar.edu.untref.aydoo;


public class ItemDeLista extends ElementoDeLinea {

    public ItemDeLista(String contenido){
        super(contenido);
    }

    public ItemDeLista() {
        super();
    }

    @Override
    public ElementoTransformadoHTML getTransformado() {

        ItemDeListaHTML itemDeListaHTML = new ItemDeListaHTML(this.getContenido());
        return itemDeListaHTML;

    }

    @Override
    public void colocarStringDeContenidoPropio(String contenido) {
        this.contenido = contenido.substring(1);
    }

}