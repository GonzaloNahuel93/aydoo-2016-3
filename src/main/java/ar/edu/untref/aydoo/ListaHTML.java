package ar.edu.untref.aydoo;

/**
 * Created by synysterlove on 21/05/16.
 */
public class ListaHTML extends BloqueHTML{

    
    public void agregarItem(ItemDeListaHTML item) {

        this.lineas.add(item);
        
    }

    @Override
    public String getContenido() {

        return "<ul>\n" + super.getContenido() + "</ul>";

    }
}
