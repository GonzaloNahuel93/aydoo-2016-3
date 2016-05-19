package ar.edu.untref.aydoo;

/**
 * Created by synysterlove on 19/05/16.
 */
public class Titulo extends Elemento {


    public Titulo(String titulo) {

        super(titulo);

    }
    
    @Override
    public LineaHTML getTransformado() {

        TituloHTML tituloHTML = new TituloHTML(this.getContenido());
        return tituloHTML;

    }
}
