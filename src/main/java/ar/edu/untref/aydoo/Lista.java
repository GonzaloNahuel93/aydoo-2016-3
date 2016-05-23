package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Lista extends Elemento {

    private List<ItemDeLista> items;

    public Lista() {
        items = new ArrayList<ItemDeLista>();
    }

    @Override
    public ElementoTransformadoHTML getTransformado() {

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

    public List<ItemDeLista> getItems() {

        return this.items;

    }

    @Override
    public boolean equals(Object obj) {

        Lista otraLista = (Lista)obj;
        List<ItemDeLista> otrosItems = otraLista.getItems();
        List<ItemDeLista> estosItems = this.getItems();
        if(otrosItems.size() != estosItems.size()) return false;
        for(int i=0; i < estosItems.size(); i++) { //Las dos listas tienen que ser del mismo tamaño asi que no hay riesgo de excepcion

            if(!estosItems.get(i).equals(otrosItems.get(i))) return false; //Si algun par de items es distinto, tira falso

        }
        return true; //Si todos fueron iguales, se retorna true

    }
}