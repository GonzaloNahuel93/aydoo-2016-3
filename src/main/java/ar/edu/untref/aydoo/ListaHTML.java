package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class ListaHTML implements ElementoHTML {

    protected List<LineaHTML> lineas;

    protected ListaHTML(){
        this.lineas = new ArrayList<LineaHTML>();
    }

    private String construirStringLista(){

        String stringLista = "";

        for(LineaHTML linea: this.lineas){
            stringLista = linea.concatenarContenido(stringLista);
        }

        return stringLista;

    }

    public void agregarItem(ItemDeListaHTML item) {
        this.lineas.add(item);       
    }

    @Override
    public String getContenido() {

    	return this.concatenarContenido("");

    }

    @Override
    public String concatenarContenido(String contenido) {

        return "<ul>\n" + this.construirStringLista() + "</ul>";

    }
}