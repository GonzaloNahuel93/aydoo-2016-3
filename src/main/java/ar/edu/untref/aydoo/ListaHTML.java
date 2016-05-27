package ar.edu.untref.aydoo.componenteshtml;

import java.util.ArrayList;
import java.util.List;

public class ListaHTML implements ElementoHTML {

    protected List<LineaHTML> lineas;

    public ListaHTML(){
        this.lineas = new ArrayList<LineaHTML>();
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

    	contenido += "<ul>\n" + this.construirStringLista() + "</ul>\n";
        return contenido;

    }

    private String construirStringLista(){

        String stringLista = "";

        for(LineaHTML linea: this.lineas){
            stringLista = linea.concatenarContenido(stringLista);
        }

        return stringLista;

    }

}