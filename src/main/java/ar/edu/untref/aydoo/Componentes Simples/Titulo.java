package C.ComponentesSimples;

import D.ComponentesHTML.LineaHTML;
import D.ComponentesHTML.TituloHTML;

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