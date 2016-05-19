package ar.edu.untref.aydoo;

/**
 * Created by synysterlove on 19/05/16.
 */
public class TituloHTML extends LineaHTML {
    
    public TituloHTML(String contenido) {

        super("<h1>" + contenido + "</h1>");

    }

    @Override
    public String getContenido() {

        return(this.contenido);

    }
}
