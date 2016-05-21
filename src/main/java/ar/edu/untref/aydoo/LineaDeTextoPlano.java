package ar.edu.untref.aydoo;

/**
 * Created by synysterlove on 21/05/16.
 */
public class LineaDeTextoPlano extends Elemento {
    
    public LineaDeTextoPlano(String texto) {

        super(texto);
        
    }

    @Override
    public LineaHTML getTransformado() {

        TextoPlanoHTML texto = new TextoPlanoHTML(this.getContenido());
        return texto;

    }
}
