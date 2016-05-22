package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by synysterlove on 22/05/16.
 */
public class Lista implements Transformable {


    private List<ItemDeLista> items;

    public Lista() {

        items = new ArrayList<ItemDeLista>();

    }

    @Override
    public ComponenteHTML getTransformado() {

        ListaHTML listaTransformada = this.transformarItems(new ListaHTML());
        return listaTransformada;

    }

    private ListaHTML transformarItems(ListaHTML listaHTML) {

        for(ItemDeLista item : this.items) {

            listaHTML.agregarItem(new ItemDeListaHTML(item.getContenido()));

        }

        return listaHTML;

    }

    public void agregarItem(ItemDeLista item) {

        this.items.add(item);

    }
}
