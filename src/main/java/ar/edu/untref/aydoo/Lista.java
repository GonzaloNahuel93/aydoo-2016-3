package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by synysterlove on 22/05/16.
 */
public class Lista extends Elemento {


    private List<ItemDeLista> items;

    public Lista() {

        items = new ArrayList<ItemDeLista>();

    }

    @Override
    public TransformadoHTML getTransformado() {

        ListaHTML listaTransformada = this.transformarItems(new ListaHTML());
        return listaTransformada;

    }

    private ListaHTML transformarItems(ListaHTML listaHTML) {

        Transformador transformadorItems = new Transformador();
        for(ItemDeLista item : this.items) {

            ItemDeListaHTML itemHTML = (ItemDeListaHTML) transformadorItems.transformar(item);
            listaHTML.agregarItem(itemHTML);

        }

        return listaHTML;

    }

    public void agregarItem(ItemDeLista item) {

        this.items.add(item);

    }
}
